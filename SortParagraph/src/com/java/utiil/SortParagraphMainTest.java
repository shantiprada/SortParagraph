/**
 * 
 */
package com.java.utiil;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author shanti
 *
 */
public class SortParagraphMainTest {
	
	SortParagraphMain classUnderTest = new SortParagraphMain();
	
	@Test
	public void removeWhiteSpaceTest()
	{
		String paragraph = "This code should remove white spaces from this text";
		String expectedResult = "Thiscodeshouldremovewhitespacesfromthistext";
		String removedWhiteSpacesParagraph = SortParagraphMain.removeWhiteSpace(paragraph);
		assertTrue(expectedResult.equals(removedWhiteSpacesParagraph));
	}
	
	@Test
	public void removeCommasTest()
	{
		String paragraph = "yes, you are right";
		String expectedResult = "yes you are right";
		String removedCommasParagraph = SortParagraphMain.removePunchuation(paragraph);
		assertTrue(expectedResult.equals(removedCommasParagraph));
	}
	
	@Test
	public void removePeriodsTest()
	{
		String paragraph = "This looks good.";
		String expectedResult = "This looks good";
		String removedPeriodsParagraph = SortParagraphMain.removePunchuation(paragraph);
		assertTrue(expectedResult.equals(removedPeriodsParagraph));
	}
	
	
	
}	