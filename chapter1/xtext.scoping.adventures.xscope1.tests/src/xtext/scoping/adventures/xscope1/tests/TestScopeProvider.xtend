package xtext.scoping.adventures.xscope1.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Test
import org.junit.runner.RunWith
import xtext.scoping.adventures.xscope1.Program
import xtext.scoping.adventures.Xscope1InjectorProvider

@InjectWith(Xscope1InjectorProvider)
@RunWith(XtextRunner)
class TestScopeProvider {
	@Inject extension ParseHelper<Program>
	@Inject extension ValidationTestHelper
	@Inject extension IScopeProvider
	
	@Test
	def void testSimpleCrossReferencesWork() {
		val program='''
			var foo
			var bar
			
			foo = bar
		'''.parse
		program.assertNoErrors
	}
	
}