package week4.week4_assignment;

public class HomeAssignment2a_APIClient {
	public void sendRequest(String endpoint){
		System.out.println("Request \"" + endpoint + "\" is called Successfully" );
		
	}
	
	public void sendRequest(String endpoint, String  requestBody , boolean  requestStatus){
		System.out.println("Request \"" + endpoint + "\" is called Successfully");
		System.out.println("Requested body is : "+ requestBody);
		if (requestStatus == true){
			System.out.println("Status : Request has been sent successfully!");
		}else {
			System.out.println("Status : Oops! Request is not sent");
		}
		
	}

	public static void main(String[] args) {
		HomeAssignment2a_APIClient api=new HomeAssignment2a_APIClient();
		System.out.println("------------First Method------------");
		api.sendRequest("www.google.com");
		System.out.println();
		System.out.println("------------Second Method------------");
		api.sendRequest("www.whatsappchat.com", "How are you?", false);

	}

}
