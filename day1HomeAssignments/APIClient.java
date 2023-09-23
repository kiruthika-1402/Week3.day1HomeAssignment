package week3.day1HomeAssignments;

   // Method Overloading

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Sending a request to endpoint :"+endpoint);

	}
	
	public void sendRequest(String endpoint,String requestBody, Boolean requestStatus) {
		
		System.out.println("Sending a request to endpoint :"+endpoint);
		System.out.println("Request Body :"+requestBody);
		System.out.println("Request Status :"+requestStatus);

	}

	public static void main(String[] args) {
		
		APIClient ac = new APIClient();
		
		ac.sendRequest("api/endpoint1");
		ac.sendRequest("api/endpoint2", "Request data", false);

	}

}
