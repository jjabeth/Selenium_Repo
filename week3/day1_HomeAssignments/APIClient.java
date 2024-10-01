package week3.day1_HomeAssignments;

public class APIClient {
	
	//Create a sendRequest method passing single string arguments
	public String sendRequest(String endPoint) {
		String s1 = "API endPointn Single arguments";
		System.out.println(s1);
		return endPoint;
	}
	// passing three arguments
	public String sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		String s = "response Body";
		System.out.println(s);
		String s1 = "API endPoint";
		System.out.println(s1);
		boolean status = true;
		System.out.println(status);
		return requestBody;
		
	}
	// create a main method
	public static void main(String[] args) {
		//Create a object
		APIClient api = new APIClient();
		api.sendRequest("s1");
		api.sendRequest("s1", "s", false);
	}

}
