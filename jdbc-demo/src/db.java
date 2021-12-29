
public class db {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("after the driver class is loading ");
			e.printStackTrace();
		}
		

	}

}
