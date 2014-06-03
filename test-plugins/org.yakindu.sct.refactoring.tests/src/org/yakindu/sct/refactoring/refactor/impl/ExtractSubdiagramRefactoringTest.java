package org.yakindu.sct.refactoring.refactor.impl;

import static org.yakindu.sct.refactoring.test.models.RefactoringTestModels.EXTRACT_SUBDIAGRAM;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yakindu.sct.refactoring.refactor.AbstractRefactoring;
import org.yakindu.sct.refactoring.refactor.ViewBasedRefactoringTest;
import org.yakindu.sct.test.models.TestModelInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(TestModelInjectorProvider.class)
public class ExtractSubdiagramRefactoringTest extends ViewBasedRefactoringTest {

	@Test
	public void testTwoEntryPoints() {
		testRefactoring(
				EXTRACT_SUBDIAGRAM + "before_twoEntryPoints.sct", 
				EXTRACT_SUBDIAGRAM + "after_twoEntryPoints.sct", 
				"Composite");
	}
	
	@Test
	public void testTwoComposites() {
		testRefactoring(
				EXTRACT_SUBDIAGRAM + "before_twoComposites.sct", 
				EXTRACT_SUBDIAGRAM + "after_twoComposites.sct", 
				"Composite_Composite_A");
	}

	@Override
	protected AbstractRefactoring<View> getRefactoring() {
		return new ExtractSubdiagramRefactoring();
	}

}