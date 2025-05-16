package week3.week3_assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		String test = "changeme"; // declaring a string
		char[] characters = test.toCharArray(); //converting string to characters array

		for (int i = 0; i < characters.length; i++) {
			if (i%2 != 0) {             //looping the odd text
				characters[i] = Character.toUpperCase(characters[i]); //converting the odd text to uppercase
			}
		}
		System.out.println(characters); //printing the character array
	}
}
