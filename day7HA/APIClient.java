package day7HA;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);

	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.print(endpoint);
		System.out.print(" "+requestBody);
		System.out.print(" "+requestStatus);

	}
	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("Weather data");
		api.sendRequest("Weather data","Binary",true);
		
	}

}
