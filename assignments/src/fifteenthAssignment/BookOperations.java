package fifteenthAssignment;
import java.sql.*;
import java.util.Scanner;

class Book{
	void createTable(Connection con) {
		String query = """
				CREATE TABLE BOOK(
					id INTEGER PRIMARY KEY,
					name VARCHAR(20),
					author VARCHAR(20),
					price INTEGER,
					category VARCHAR(20)
				)""";
		
		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.executeUpdate();
			System.out.println("Table Created Successfully!!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	void showTable(Connection con) {
		String query = "SELECT * FROM BOOK";
		
		try(PreparedStatement stmt = con.prepareStatement(query)){
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("author")+" "+rs.getInt("price")+" "+rs.getString("category"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	void dropTable(Connection con) {
		String query = "DROP TABLE BOOK";
		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.executeQuery();
			System.out.println("Table deleted successfully!!");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	void updateRowInTable(Connection con, Scanner sc) {
		String query = "UPDATE BOOK SET name=?, author=?, price=?, category=? WHERE id=?";
		System.out.print("Enter ID : ");
		int id = sc.nextInt();
		System.out.print("Enter Name : ");
		String name = sc.next();
		System.out.print("Enter Author : ");
		String author = sc.next();
		System.out.print("Enter Price : ");
		int price = sc.nextInt();
		System.out.print("Enter Category: ");
		String category = sc.next();
		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.setString(1, name);
			stmt.setString(2, author);
			stmt.setInt(3, price);
			stmt.setString(4, category);
			stmt.setInt(5, id);
			
			int rs = stmt.executeUpdate();
			if(rs > 0) {
				System.out.println("Row Updated Successfully!!");
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	void insertInTable(Connection con, Scanner sc) {
		String query = "INSERT INTO BOOK (id, name, author, price, category) VALUES(?, ?, ?, ?, ?)";
		System.out.print("Enter ID : ");
		int id = sc.nextInt();
		System.out.print("Enter Name : ");
		String name = sc.next();
		System.out.print("Enter Author : ");
		String author = sc.next();
		System.out.print("Enter Price : ");
		int price = sc.nextInt();
		System.out.print("Enter Category: ");
		String category = sc.next();
		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, author);
			stmt.setInt(4, price);
			stmt.setString(5, category);
			
			int rs = stmt.executeUpdate();
			if(rs > 0) {
				System.out.println("Row Inserted Successfully!!");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class BookOperations {

	public static void main(String[] args) throws SQLException{
		String name = "SYS as SYSDBA";
		String pass = "Satara@123";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		Connection con = DriverManager.getConnection(url, name, pass);
		Scanner sc = new Scanner(System.in);
		
		try {
			Book book = new Book();
			int choice=0;
			book.createTable(con);
			do {
				System.out.println("-----BOOK Table Operations-----");
				System.out.println("1. Insert a row in table");
				System.out.println("2. Update a row in table");
				System.out.println("3. Drop a table");
				System.out.println("4. Show table");
				System.out.println("5. Exit");
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					book.insertInTable(con, sc);
					break;
				case 2:
					book.updateRowInTable(con, sc);
					break;
				case 3:
					book.dropTable(con);
					break;
				case 4:
					book.showTable(con);
					break;
				case 5:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice");
				}
			} while(choice!=5);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			con.close();
		}
	}

}
