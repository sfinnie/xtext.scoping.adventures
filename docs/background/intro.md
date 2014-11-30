#De-mystifying Xtext naming & scoping
Much of Xtext is pleasantly straightforward and productive to use.  There are some gnarly corners however, and - judging by the [forum activity](https://www.eclipse.org/forums/index.php?t=thread&frm_id=27), the gnarliest of the gnarlies is probably naming & scoping.  There are [several](http://www.peterfriese.de/writing-xtext-scope-providers-with-xtend/) [tutorials](http://xtextcasts.org/episodes/17-restricting-scope) and [articles](http://www.euclideanspace.com/software/development/eclipse/xtext/infrastructure/scoping/index.htm) that help, as well as the [official documentation](https://www.eclipse.org/Xtext/documentation.html#scoping).  Despite those the questions continue.  So this is another attempt to describe the topic in the hope that some hard-won understanding might help others.

#What's the problem?
In his [seminal book](http://en.wikipedia.org/wiki/How_to_Solve_It), George Polya lays out a 4 step plan for solving a problem.  Step 1 - and often overlooked - is to be clear about defining it first.  This section attempts to do that.  If you already understand that you can safely [skip to the next section](naming-and-scoping-framework-overview.md).

Let's start with an example:

	public class Order {
	
		private int amount;
	
		public Order(int amount) {
			this.amount = amount;
		}
	
	}

It's a really simple class (in java, but that doesn't matter).  The important thing is the word `amount` appears 4 times in all.  If you're reading this then the meaning of each is probably obvious, but for sake of clarity:

	private int amount;

declares an attribute named `amount`

	public Order(int amount) {

declares a parameter to the `Order` constructor, also named `amount`.

	this.amount=amount;

assigns the value of the latter to the former.

The first two are *declarations* (or *definitions*).  And if we only ever had to deal with declarations, none of this scoping stuff would be necessary.  However, declarations on their own aren't really any use.  To do interesting stuff, we need to be able to refer to those declarations and do things with them.  And that's exactly what the last line does; it contains 2 *references*.

##What's referring to what?

Most people will know that the `amount` in `this.amount` is a reference to the  class attribute `amount`; and the `amount` after the equals sign refers to the `amount` constructor parameter.  But how did you know?  Syntactically they're all the same string. There's nothing intrinsic in the text itself that says categorically, unequivocally, which declaration each reference points to. For the program to make any sense however, that needs to be unambiguous.  **That's the problem Xtext's naming & scoping mechanism addresses.**

Specifically, the problem is **name resolution**.  References in textual languages are just strings; when parsing the language, we need rules to determine which *declaration* any given *reference* points to.  This is the basis of the primary requirement for naming and scoping:

**Requirement 1: it must be possible to specify unambiguously how references are resolved to declarations**

###An aside on terminology
In the context of name resolution, the term *definition site* is often used for declarations, and *use site* for references.  We'll stick with *declaration* and *reference* in the remainder of this article.

##How shall I name thee?
OK back to the problem.  In the description above I cheated a little in describing the assignment statement:

> the `amount` in `this.amount` is a reference to the attribute `amount`

strictly speaking, it's not just the `amount` part that forms the reference, it's the whole `this.amount`.  But there's no `this` in the attribute declaration; it's a part of the Java language specification that `this` can be used to clarify that a reference points to an attribute of the class.

Again there's nothing surprising there.  The important thing is that the attribute *has two different names*: it's declared as `amount` and referred to as `this.amount`.  This is an example of a more general requirement:

**Requirement 2: Each declaration can be referred to using multiple names**

More specifically, the name used by a reference will depend on the context of both the declaration and the reference.

##Visibility
Generally, there are restrictions on which declarations are visible from a given context.  For example, consider the following test case for the `Order` class above:

	public class TestOrder {
	
		@Test
		public void testAmountAttributeNotVisible() {
			Order order = new Order(25);
			Assert(order.amount == 25);
		}
	}

This won't even compile; the compiler throws an error on this line:

	Assert(order.amount == 25);

It's trying to access the order's `amount` attribute.  The attribute exists; it's the same one that's written successfully in the constructor.  The test fails because the attribute is declared as private:

	private int amount;

Which means the attribute is visible only to references declared within the class; it's not visible outwith that context.  This raises another requirement on the name resolution mechanism:

**Requirement 3: Name resolution must support restricting which declarations are visible depending on the respective locations of the declaration and reference.**

###Terminology again
Restricting visibility *is* scoping.  We would say the `amount` attribute declaration is:

* *in scope* when resolving the reference `this.amount` in the constructor;
* *out of scope* when resolving the reference `order.amount` in the test. 

##Summing up
* The problem is about **name resolution**: defining how **references** are resolved to **declarations** [^1].
* Each **declaration** can be referred to using **different names** depending on the **context** in which the declaration and reference exist.
* Only some declarations are **in scope** when resolving references.  

In general each language defines its own rules for naming, scoping and resolution.  By definition Xtext can't therefore provide, out of the box, a fully functioning name resolution implementation for them all.  Having said that, a default which can be customised as necessary is very useful.  And that's exactly what Xtext supplies; a framework to help implement name resolution for each language.  There is a default implementation which works, out of the box, for languages that comply with its rules.  That implementation can be customised in various ways to accommodate the requirements of each language.

[^1]:  It might have been more intuitive had Xtext used the term "Name Resolution" rather than "Scoping", since Scoping is only part of the solution to name resolution.  That's a relatively moot point however.


