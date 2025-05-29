package week4.Week4_day1;

public class ActivityOverriding extends ActivityOverloading {

	public void reportStep(String message,String status, boolean snap){
		System.out.println("Message : " + message);
		System.out.println("Status : " + status);
		if (snap == true) {
			System.out.println("Snapshot is taken");
		}
		else {
			System.out.println("Snapshot is not taken");
		}
		
	}
	public static void main(String[] args) {
		ActivityOverriding Or=new ActivityOverriding();
		Or.reportStep("Hi", "not delivered", true);

	}

}
