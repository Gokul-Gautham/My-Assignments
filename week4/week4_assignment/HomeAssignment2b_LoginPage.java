package week4.week4_assignment;

public class HomeAssignment2b_LoginPage extends HomeAssignment2b_BasePage {
public void GetURL(String inputurl){
	System.out.println("URL \"" +inputurl + "\" has been fetched successfully! ");
}

@Override
public void performCommonTasks(int age, String username ){
	if (age>15) {
		System.out.println("Hello " +username+ " welcome to the page!");
		System.out.println("Create your new mail!");
		
	}else {
		System.out.println("Hello " +username+ " Kindly try again later!");
	}

}
	public static void main(String[] args) {
		HomeAssignment2b_LoginPage lp=new HomeAssignment2b_LoginPage();
		lp.GetURL("www.gmail.com");
		lp.performCommonTasks(112, "Gokul-raj");

	}

}
