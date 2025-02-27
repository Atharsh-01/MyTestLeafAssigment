package Day8HA;

public abstract class MySqlConnection implements DatabseConnection {
	
	public void executeQuery() {
		System.out.println("Query is getting excecuted");
	}

}
