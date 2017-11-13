
public class PRSConsoleApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the PRS application");
			System.out.println("Please enter the attributes of a User");
			
			int id = Console.getInt("User ID: ");
			String username = Console.getString("userName: ", 20);
		    String password = Console.getString("password: ", 10);
			String firstName = Console.getString("firstName: ");
			String lastName = Console.getString("lastName: ");
			String phone = Console.getString("phoneNumber: ");
			String email = Console.getString("email: ");
			boolean reviewer = Console.getBoolean("reviewer(true or false): ");
			boolean admin = Console.getBoolean("admin (true or false): ");
			System.out.println();
			
			User u = new User(id, username, password, firstName, lastName, phone, email, reviewer, admin);
			System.out.println("passing u to print statement = "+u);
			System.out.println("super.toString() = "+u.);
			
	}

}
