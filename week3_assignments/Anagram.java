package week3.week3_assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Define two input strings
		String text1 = "eat";
		String text2 = "tea";

		if (text1.length() == text2.length()) {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			String value1 = String.valueOf(charArray);
			String value2 = String.valueOf(charArray2);

			if (value1.equals(value2)) {
				System.out.println("The given strings are Anagram.");
			}
			else {
				System.out.println("The given strings are not an Anagram.");
			}

		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}



	}

}
