/*
 * generated by Xtext
 */
package xtext.scoping.adventures.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractXscope1Validator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(xtext.scoping.adventures.xscope1.Xscope1Package.eINSTANCE);
		return result;
	}
}
