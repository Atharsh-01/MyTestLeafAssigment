package Day8HA;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("DataBase is connected");
	}

	@Override
	public void disconnect() {
		System.out.println("DataBase is disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("DateBase is getting updated");
	}
	public static void main(String[] args) {
		JavaConnection j=new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.executeQuery();
	}

}
