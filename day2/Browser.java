package week1.day2;

public class Browser {

	//Creating a method called launchBrowser
	public String launchBrowser(String browserName ) {
		System.out.println("Browser launched Successfully: " + browserName);
		return browserName;
	}
	//Creating a method called loadurl , Void method will not have "return" type
	void loadUrl(){
		System.out.println("Url is loaded");
	}
	
	// Calling methods inside the main method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		b.launchBrowser("Chrome");
		b.loadUrl();

	}

}
