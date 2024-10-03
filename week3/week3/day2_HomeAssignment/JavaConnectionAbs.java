package week3.day2_HomeAssignment;

public class JavaConnectionAbs extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("connect mehtod is implemented from mysqlconnection");
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnect method is implemented from mysqlconnection");
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method is implemented mysqlconnection abs method");
	}

	//create main method
	public static void main(String[] args) {
		//create object
		JavaConnectionAbs jc = new JavaConnectionAbs();
		jc.connect();
		jc.disConnect();
		jc.executeUpdate();
	}

}
