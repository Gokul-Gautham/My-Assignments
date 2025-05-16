package week3.week3_assignments;

public class Subclasses_LoginTestData extends Superclass_TestData {
 public String enterUsername(String Username){
	 System.out.println("Username is entered");
	 return Username;
 }
 public String enterPassword (String Password){
	 System.out.println("Password is entered");
	 return Password;
 }

	public static void main(String[] args) {
		Subclasses_LoginTestData sub=new Subclasses_LoginTestData();
		System.out.println("Calling from Subclass :");
		sub.enterUsername("Firstname");
		sub.enterPassword("qwer");
		System.out.println("Calling from Superclass :");
		sub.enterCredentials();
		sub.navigateToHomePage();

	}

}
