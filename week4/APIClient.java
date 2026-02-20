package week4;

public class APIClient {

	void sendRequest(String endpoint) {
		
		System.out.println(endpoint);

	}

	void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println(endpoint+" "+requestBody+" "+requestStatus);

	}
	
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("PC");
		api.sendRequest("pc", "point", false);
		
	}

}
