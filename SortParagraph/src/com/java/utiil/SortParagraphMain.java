/**
 * 
 */
package com.java.utiil;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author shanti
 *
 */
public class SortParagraphMain {

	public  static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String finalInput="";
		while (input.hasNextLine()) {
			String lineNew = input.nextLine();
			if (lineNew.isEmpty()) {
				break;
			}
			finalInput+=lineNew;
		}
		finalInput = cleanText(finalInput);
		String  output = sortParagraph(finalInput);
		System.out.println(output);
	}

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

	public static String sortParagraph(String input) {
		char[] inputArray = input.toCharArray();
		char temp;
		int n = inputArray.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (Character.toLowerCase(inputArray[i]) > Character.toLowerCase(inputArray[j])) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = Character.toLowerCase(temp);
				}
			}
		}
		String out = convertCharArrayToString(inputArray);
		return out;
	}

	public static String convertCharArrayToString(char[] inputArray) {
		StringBuilder sb = new StringBuilder(inputArray.length); 
		for (Character c : inputArray) 
			sb.append(c.charValue()); 
		return sb.toString(); 
	}

}
