/**
 * 
 */
package com.java.utiil;

/**
 * @author shanti
 *
 */
public class SortParagraphMain {

	public static String removeWhiteSpace(String input) {
		input = input.replaceAll("\\s+", "");
		return input;
	}

	public static String removePunchuation(String input) {
		input = input.replaceAll("[\\,.]","");
		return input;
	}

}
