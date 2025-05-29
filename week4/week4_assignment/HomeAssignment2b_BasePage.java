package week4.week4_assignment;

public class HomeAssignment2b_BasePage {
	public void findElement(String text){
		System.out.println("Element \"" +text + "\" has been successfully identified");
	}
	public void clickElement(String button){
		System.out.println("Element \"" +button + "\" has been clicked successfully");
	}
	public void enterText(String message){
		System.out.println("Message is : " +message);
	}
	public void performCommonTasks(int age, String username ){
		if (age>15) {
			System.out.println("Hello " +username+ " welcome to the page!");
			System.out.println("Message has been sent successfully!");
			
		}else {
			System.out.println("Hello " +username+ " Kindly try again later!");
		}

	}


	public static void main(String[] args) {
		HomeAssignment2b_BasePage bp=new HomeAssignment2b_BasePage();
		bp.findElement("Input text");
		bp.clickElement("Input Message");
		bp.enterText("What is your name?");
		bp.performCommonTasks(17, "Gokul");
	}

}
