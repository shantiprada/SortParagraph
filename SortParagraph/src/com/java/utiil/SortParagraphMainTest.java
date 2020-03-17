/**
 * 
 */
package com.java.utiil;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @author shanti
 *
 */
public class SortParagraphMainTest {
	
	SortParagraphMain classUnderTest = new SortParagraphMain();
	
	@Test
	public void removeWhiteSpaceNullTest()
	{
		String input = null;
		String removedWhiteSpacesParagraph = SortParagraphMain.removeWhiteSpace(input);
		assertSame(input, removedWhiteSpacesParagraph);
	}
	
	@Test
	public void removeWhiteSpaceTest()
	{
		String paragraph = "This code should remove white spaces from this text";
		String expectedResult = "Thiscodeshouldremovewhitespacesfromthistext";
		String removedWhiteSpacesParagraph = SortParagraphMain.removeWhiteSpace(paragraph);
		assertTrue(expectedResult.equals(removedWhiteSpacesParagraph));
	}
	
	@Test
	public void removePunchuationNullTest()
	{
		String input = null;
		String removedCommasParagraph = SortParagraphMain.removePunchuation(input);
		assertSame(input, removedCommasParagraph);
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
	
	@Test
	public void removeQuestioMarkTest()
	{
		String paragraph = "How are you doing?";
		String expectedResult = "How are you doing";
		String removedQuestionMarkParagraph = SortParagraphMain.removePunchuation(paragraph);
		assertTrue(expectedResult.equals(removedQuestionMarkParagraph));
	}
	
	@Test
	public void removeWhiteSpaceAndPuncuationNullTest() throws Exception
	{
		String input = null;
		String actualResult = SortParagraphMain.cleanText(input);
		actualResult = SortParagraphMain.removePunchuation(actualResult);
		assertSame(input, actualResult);
	}
	
	@Test
	public void removeWhiteSpaceAndPuncuationTest() throws Exception
	{
		String paragraph = "Hi, how are you? This code should remove white spaces and punchuaiton too.";
		String expectedResult = "HihowareyouThiscodeshouldremovewhitespacesandpunchuaitontoo";
		String actualResult = SortParagraphMain.cleanText(paragraph);
		actualResult = SortParagraphMain.removePunchuation(actualResult);
		assertTrue(expectedResult.equals(actualResult));
	}
	
	@Test
	public void oversizeException() {
		String paragraph = "Hi, how are you? This code should remove white spaces and punchuaiton too."
				+"Hi, how are you? This code should remove white spaces and punchuaiton too.Hi, how are "
				+"you? This code should remove white spaces and punchuaiton too.Hi, how are you? "
				+ "This code should remove white spaces and punchuaiton too.Hi, how are you? This code "
				+ "should remove white spaces and punchuaiton too.Hi, how are you? This code should "
				+ "remove white spaces and punchuaiton too.Hi, how are you?";
		try {
			SortParagraphMain.cleanText(paragraph);
			fail();
		} catch (Exception e) {
		}
	}
	
	
}	