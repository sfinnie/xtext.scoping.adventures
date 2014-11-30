#Custom Naming
Whereas scoping determines which possible targets are visible from a given reference, naming determines what they're known as.  As an example, let's modify the laguage so that relatonships among entities are first class constructs rather than analogous to references.  So we want to be able to write:

	Rel DogOwnership {
		Each Dog "is owned by" 0..1 People
		Each Person "owns" 0..* Dogs
	}

That requires several tweaks to the grammar:

1. Introduction of the Relationship rule and derivatives
2. Restricting class attributes to be of type Datatype only (i.e. no references to Entities)
3. Supporting plural names

Here's the revised grammar:

	grammar xtext.scoping.explained.Entities with org.eclipse.xtext.common.Terminals
	
	generate entities "http://www.scoping.xtext/explained/Entities"
	
	Domainmodel :
		(elements += DomainModelElement)*
	;
	
	DomainModelElement:
		Type | Relationship
	;
	Type:
		DataType | Entity
	;
	DataType:
		'datatype' name = ID
	;
	Entity:
		'entity' name = ID 'plural' plural = ID ('extends' superType = [Entity])? '{'
			(features += Feature)*
		'}'
	;
	Feature:
		name = ID ':' type = [DataType]
	;
	
	Relationship:
		'rel' name=ID '{'
			(relRoles+=RelRole)+
		'}'
	;
	
	RelRole:
		'Each' e1=[Entity] relPhrase=STRING multiplicity=Multiplicity e2=[Entity];
	
	Multiplicity:
		"0..1" | "1" | "0..*" | "*" | "1..*";

Re-generating the plugin & running however produces errors in the Relationship phrases; cross-reference resolution fails when the plural names are used.  It would work if the example was changed as follows:

    rel DogOwnership {
	   Each Dog "is owned by" 0..1 Person
	   Each Person "owns" 0..* Dog
    }

However that doesn't read properly; plurals would be better.

It fails because Xtext has a convention.  Any attribute of a rule named `name` or `id` is assumed to be the identifier by which instances are used.  Those are, in turn, used as the strings used as target names when the `LinkingService` is trying to match references against targets.  Xtext doesn't natively understand plurals - or multiple names for any given concept in general.  Consequently we need to customise the naming for `entities` so that both singular and plural names can be used.

##Implementation
This is easily supported by customising the `EntitiesScopeProvider` as follows:

	class EntitiesScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
	
		/**
		 * Customise the scope for Relationship cross-references so that plural class names can be used.
		 */
		def scope_RelRole_e2(RelRole relRole, EReference eEntityRef) {
			val outerScope = delegateGetScope(relRole, eEntityRef)
			Scopes::scopeFor(
				outerScope.allElements.map[it.EObjectOrProxy as Entity],
				[QualifiedName::create(it.plural)],
				outerScope
			)
		}
	}



Naming is handled by the Xtext class [`ImportedNamespaceAwareLocalScopeProvider`](https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext/src/org/eclipse/xtext/scoping/impl/ImportedNamespaceAwareLocalScopeProvider.java) and in particular the method `internalGetAllDescriptions(Resource)`.

Needs customised:
* `ResourceDescriptionStrategy`
* `ImportedNamespaceAwareLocalScopeProvider`
*  `EntitiesScopeProvider`

