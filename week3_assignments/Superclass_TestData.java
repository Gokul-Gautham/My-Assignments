package week3.week3_assignments;

public class Superclass_TestData {
	public void enterCredentials(){
		System.out.println("Validating Credentials.......");
	}

	public void  navigateToHomePage(){
		System.out.println("Home page is opened");
	}

	public static void main(String[] args) {

		Superclass_TestData Sc=new Superclass_TestData();
		Sc.enterCredentials();
		Sc.navigateToHomePage();
	}

}


