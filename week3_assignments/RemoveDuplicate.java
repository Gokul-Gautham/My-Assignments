package week3.week3_assignments;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

		// Split the text into words
		String[] words = text.split(" ");
		int count=0;

		// Outer loop to pick each word
		for (int i = 0; i < words.length; i++) {
			count =+ 1;

			// Skip if already marked as empty string
			if (words[i].equals(" ")) {
				continue;
			}

			// Inner loop to compare with every other word
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					words[j] = " "; // Mark duplicate word as empty
					count++;
				}
			}

			// If count > 1, that means we found duplicates
			if (count > 1) {
				System.out.println("Duplicate found: " + words[i]);
			}
		}

		// Print the result
	
		String b = String.join(" ", words); //to convert string[] to string
		System.out.println("Modified text: " + b);
	}
}

