package fifteenthAssignment;
import java.sql.*;
import java.util.Scanner;


public class Demo1 {
	private static void createTable(Statement stmt) {
		String query = """
				CREATE TABLE EMPLOYEE(
					employeeId NUMBER PRIMARY KEY,
					firstName VARCHAR(20),
					lastName VARCHAR(20),
					department VARCHAR(20)
				)""";
		
		try {
			stmt.executeUpdate(query);
			System.out.println("Table initialized");
		} catch (SQLException e) {
			if(e.getMessage().contains("ORA-00955")) {
				System.out.println("Table already exists");
			}
			e.printStackTrace();
		}
	}
	private static void createEmployee(Statement stmt, Scanner sc) {
		int employeeId = sc.nextInt();
		String firstName = sc.next();
		String lastName = sc.next();
		String department = sc.next();
		String query ="INSERT INTO EMPLOYEE (employeeId, firstName, lastName, department) VALUES ('" + employeeId +"', '"+ firstName +"', '"+lastName+"', '"+ department + "')";
		
		try {
			int res = stmt.executeUpdate(query);
			if(res > 0) {
				System.out.println("New student added");
			}
		} catch (SQLException e) {
			System.out.println("Error in adding employee "+e.getMessage());
		}
	}

	private static void deleteEmployee(Statement stmt) {
		String query = "DROP TABLE EMPLOYEE";
		try {
			boolean rs = stmt.execute(query);
			if(rs==true){
				System.out.println("Employee table deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void displayEmployee(Statement stmt) {
		String query = "SELECT * FROM EMPLOYEE";
		try {
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("employeeId")+"  "+rs.getString("firstName")+"  "+rs.getString("lastName")+" "+rs.getString("department"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
    public static void main(String args[]) throws SQLException{
    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SYS as SYSDBA", "Satara@123");
    	Scanner sc = new Scanner(System.in);
    	Statement stmt = con.createStatement();
    	try {
			createTable(stmt);
			int choice = 0;
			do {
				System.out.println("\n------Employee Table Operations---------\n\n1. Create an Employee Table \n2. Delete Employee \n3. Display Employee Table \n4. Exit");
				System.out.print("Enter your choice:");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						createEmployee(stmt, sc);
						System.out.println("Employee created...");
						break;
					case 2:
						deleteEmployee(stmt);
						System.out.println("Employee Table Deleted Successfully!!");
						break;
					case 3:
						displayEmployee(stmt);
						break;
					case 4:
						System.out.println("Thank You");
						break;
					default:
						System.out.println("Invalid choice...");	
				}
			}while(choice!=4);
		}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
		finally {
			deleteEmployee(stmt);
			con.close();
			sc.close();
		}	
	}
	
}
