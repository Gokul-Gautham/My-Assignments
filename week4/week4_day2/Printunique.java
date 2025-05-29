package week4.week4_day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Printunique {

	public static void main(String[] args) {
		String input = "Hello";
		
		char[] charArray = input.toCharArray();
		
		//Set <Character> unique = new HashSet<Character>();
		Set <Character> unique = new LinkedHashSet<Character>();
		//Set <Character> unique = new TreeSet<Character>();
		Set <Character> duplicates = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			boolean b = unique.add(charArray[i]);
			
			if (!b) {
				duplicates.add(charArray[i]);
			}
			
		}
System.out.println("Uniques are : " +unique);
System.out.println("Duplicates are : " + duplicates);
	}

}
