package week1.week1_assignment;

public class Palindrome {
	
	//Palindrome for string
	
	String stringrev(String text)
	{
		System.out.println("Palindrome for string");
		int len = text.length();
		System.out.println("Length of a text is : " + len);
		String output1 = "";
		for (int i=len-1; i>=0; i--) 
		{
			output1 += text.charAt(i);

		}
		//System.out.println(output1);
		//if (output1 == input) { not working!
		if (output1.equals(text)) 
		{
			System.out.println("Text [" + text +"] is a Palindrome");
		} 
		else 
		{
			System.out.println("Text [" + text +"] is not a Palindrome");
		}
		System.out.println("--------------------------------------");
		return text;

	} 

	//Palindrome for numbers
	
	int numberrev(int input_number)
	{
		System.out.println("Palindrome for number");
		int revnum = 0;
		int duplicate = input_number;
		
		while (input_number!=0)
		{
			revnum = revnum*10 + input_number%10;
			input_number=input_number/10;
		}
		//System.out.println(revnum);
		if (revnum == duplicate) 
		{
			System.out.println("Provided Number ["+duplicate+"] is a Palindrome");
		}
		else 
		{
			System.out.println("Provided Number ["+duplicate+"] is not a Palindrome");
		}

		return input_number;

	} 

	public static void main(String[] args) {
		Palindrome pl=new Palindrome();
		pl.stringrev("raj");
		pl.numberrev(123321); 


	}

}

