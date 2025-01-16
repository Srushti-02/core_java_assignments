package fifteenthAssignment;
import java.util.Scanner;
import java.sql.*;
class Operations{
	void createStudentTable(Statement stmt){
		String query = """
				CREATE TABLE STUDENT(
					rollNo INTEGER PRIMARY KEY,
					firstName VARCHAR(20),
					lastName VARCHAR(20),
					marks INT,
					division VARCHAR(1)
				)""";
		
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Error occurred while initializing table" + e.getMessage());
		}
	}
	void insertStudentInfo(Statement stmt, Scanner sc){
		System.out.print("Enter Roll Number: ");
		int rollNo = sc.nextInt();
		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		System.out.print("Enter Last Name: ");
		String lastName = sc.next();
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		System.out.print("Enter Division: ");
		String division = sc.next();
		String query = "INSERT INTO STUDENT (rollNo, firstName, lastName, marks, division) VALUES ('"+rollNo+"', '"+firstName+"', '"+lastName+"', '"+marks+"', '"+division+"')";
		
		try {
			int rs = stmt.executeUpdate(query);
			if(rs > 0) {
				System.out.println("Student information added successfully");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	void deleteStudentTable(Statement stmt){
		String query = "DROP TABLE STUDENT";
		try {
			stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	void showStudentTable(Statement stmt){
		String query = "SELECT * FROM STUDENT";
		try {
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("rollNo" )+" "+rs.getString("firstName")+" "+rs.getString("lastName")+" "+rs.getInt("marks")+" "+rs.getString("division"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class StudentDemo{

	public static void main(String[] args) throws SQLException {
		Operations ob = new Operations();
		String AUTH = "SYS as SYSDBA";
		String Pass = "Satara@123";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, AUTH, Pass);
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		try {
			ob.createStudentTable(stmt);
			do {
				System.out.println("-------Student CRUD Operations---------");
				System.out.println("1. Add Student Into Table");
				System.out.println("2. Delete Student Table");
				System.out.println("3. Display Student Table");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						ob.insertStudentInfo(stmt, sc);
						break;
					case 2:
						ob.deleteStudentTable(stmt);
						break;
					case 3:
						ob.showStudentTable(stmt);
						break;
					case 4:
						System.out.println("Exiting");
						break;
					default:
						System.out.println("Wrong Choice");
						break;
				}
			} while(choice!=4);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			ob.deleteStudentTable(stmt);
			con.close();
			sc.close();
		}
	}

}
