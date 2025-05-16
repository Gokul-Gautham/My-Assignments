package week3.week3_assignments;

public class Concreteclass_Oracledatabase implements DatabaseConnection {
	public void connect() {
		System.out.println("------------Oracle Database is connected------------");
		
	}

	public void disconnect() {
		System.out.println("------------Oracle database is disconnected------------");
		
	}

	public void executeUpdate() {
		System.out.println("************ Database is Updated ************");
		
		
	}
	public static void main(String[] args) {
		Concreteclass_Oracledatabase DB=new Concreteclass_Oracledatabase();
		DB.connect();
		DB.executeUpdate();
		DB.disconnect();

	}

	

}
