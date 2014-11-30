package xtext.scoping.adventures.xscope1.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import xtext.scoping.adventures.Xscope1InjectorProvider;
import xtext.scoping.adventures.xscope1.Program;

@InjectWith(Xscope1InjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class TestScopeProvider {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  @Test
  public void testSimpleCrossReferencesWork() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var foo");
      _builder.newLine();
      _builder.append("var bar");
      _builder.newLine();
      _builder.newLine();
      _builder.append("foo = bar");
      _builder.newLine();
      final Program program = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(program);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
