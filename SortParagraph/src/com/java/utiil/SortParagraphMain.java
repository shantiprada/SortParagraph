/**
 * 
 */
package com.java.utiil;

/**
 * @author shanti
 *
 */
public class SortParagraphMain {
	
	public static String cleanText(String input) {
		if(input != null) {
			input = removeWhiteSpace(input);
			input = removePunchuation(input);
		}
		return input;
	}

	public static String removeWhiteSpace(String input) {
		if(input != null) {
			input = input.replaceAll("\\s+", "");
		}
		return input;
	}

	
	public static String removePunchuation(String input) {
		if(input != null) {
			input = input.replaceAll("[\\,.?]","");
		}
		return input;
	}

}
