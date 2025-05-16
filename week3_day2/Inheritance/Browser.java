package week3.week3_day2.Inheritance;

public class Browser {

	String browserName (){
		System.out.println("Browsername is :" + browserName() );
		return browserName();
	}
	String browserVersion () {
		System.out.println("Browser version is : " + browserVersion ());
		return browserVersion();
	}

	void openURL(){
		System.out.println("Url is opened > Browser class");
	}

	void closeBrowser(){
		System.out.println("Browser is closed > Browser class");
	}

	void navigateBack(){
		System.out.println("Navigated to back > Browser class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Browser bw=new Browser();
		 bw.openURL();
		 bw.closeBrowser();
		 bw.navigateBack();
		
		Chrome ch=new Chrome();
		ch.openincognito();
		ch.clearCache();
		ch.clearCookies();
		ch.takeSnap(); */
	}

}
