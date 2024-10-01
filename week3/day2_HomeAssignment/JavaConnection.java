package week3.day2_HomeAssignment;

public class JavaConnection implements DataBaseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect mehtod is implemented");
		
	}

	public void disConnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect method is implemented");
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate is implemented");
		
	}
	
	//create main method
	public static void main(String[] args) {
		//create object
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disConnect();
		jc.executeUpdate();
	}

}
