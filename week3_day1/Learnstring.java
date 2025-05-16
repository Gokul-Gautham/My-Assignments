package week3.week3_day1;

public class Learnstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		String name = "Gokul";
		String name1 = "Gokul";

		String n=new String("Raj");
		String n1=new String ("Raj");
		String n2=new String ("Gokul");
		System.out.println(name.equals(n2));
		System.out.println(name == n2);
		System.out.println(n2.contains("kul"));
		System.out.println(n1.replace("a", "o"));

		String n3 = "Raja";
		String n4 ="GowthamRaj1234";
		System.out.println(n3.replace("a", "o")); // to replace all a to o
		System.out.println(n4.replaceAll("[^A-Z]","")); // to fetch Caps letter
		System.out.println(n4.replaceAll("[^a-z]","")); // to fetch small letter
		System.out.println(n4.replaceAll("[^0-9]","")); // to fetch only numbers letter
		System.out.println(n4.replaceAll("[^A-z]","")); // to fetch both Caps & small letter

		String n5="1234";
		System.out.println(n5+10);
		// to convert string to integer
		int parseInt = Integer.parseInt(n5); //(crtl+2-l) which assigns the result of an expression to a new local variable
		System.out.println(parseInt+10);
		 
		int n6 = 12345;
		// to convert int to string
		String a = Integer.toString(n6);
		System.out.println(a+1);
		
		String word = "luffy is still joyboy";
		String[] split = word.split(" "); //to split words
		System.out.println(split[3]);

		
	}

}
