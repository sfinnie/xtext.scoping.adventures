/*
* generated by Xtext
*/
package xtext.scoping.adventures;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class Xscope1UiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return xtext.scoping.adventures.ui.internal.Xscope1Activator.getInstance().getInjector("xtext.scoping.adventures.Xscope1");
	}
	
}
