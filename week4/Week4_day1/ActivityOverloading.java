package week4.Week4_day1;

public class ActivityOverloading {
public void reportStep(String msg,String status){
	System.out.println("Message is : " + msg);
	System.out.println("Status is : " + status);
}
public void reportStep(String msg,String status, boolean snap){
	System.out.println("Message : " + msg);
	System.out.println("Status : " + status);
	if (snap == true) {
		System.out.println("Snapshot is taken");
	}
	else {
		System.out.println("Snapshot is not taken");
	}
	
}
	public static void main(String[] args) {
		ActivityOverloading ol = new ActivityOverloading();
		ol.reportStep("Hi, How are you?", "Delivered");
		System.out.println("---------------------Overloaded method------------------");
		ol.reportStep("Hello, thr?", "Not delivered", true);

	}

}
