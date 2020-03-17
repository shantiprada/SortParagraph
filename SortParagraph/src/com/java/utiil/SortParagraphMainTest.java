/**
 * 
 */
package com.java.utiil;

import static org.junit.Assert.assertSame;

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
		assertSame(expectedResult, removedWhiteSpacesParagraph);
	}
	
	@Test
	public void removeCommasTest()
	{
		String paragraph = "yes, you are right";
		String expectedResult = "yes you are right";
		String removedCommasParagraph = SortParagraphMain.removePunchuation(paragraph);
		assertSame(expectedResult, removedCommasParagraph);
	}
	
	@Test
	public void removePeriodsTest()
	{
		String paragraph = "This looks good.";
		String expectedResult = "This looks good";
		String removedCommasParagraph = SortParagraphMain.removePunchuation(paragraph);
		assertSame(expectedResult, removedCommasParagraph);
	}
	
	
	
}	