package fifteenthAssignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

class Image {
	void createImageTable(Connection con) {
		String query = """
				CREATE TABLE IMAGESET(
					IMG BLOB;
				)""";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute();
			System.out.println("Table Initialized");
		} catch (SQLException e) {
			e.getMessage();
			System.out.println("Table cannot be Initialized");
		}
	}
	void imageRetrieval(Connection con) throws IOException {
		String query = "SELECT * FROM IMAGESET";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Blob b = rs.getBlob(1);
				byte imgArr[] = b.getBytes(1, (int)b.length());
				
				FileOutputStream fo = new FileOutputStream("D:\\sfml\\extractedImg");
				fo.write(imgArr);
				fo.close();
				System.out.println("Image stored at location");
			}
		} catch (SQLException e) {
			e.getMessage();
		}
	}
	void ImageInsertion(Connection con) throws IOException {
		FileInputStream fs = new FileInputStream("D:\bamnoli\2023-02-08.jpg");
		String query = "INSERT INTO IMAGESET (logo) VALUES (?)";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setBlob(1, fs);
			ps.setBinaryStream(1,fs,fs.available());
			int rs=ps.executeUpdate();
			if(rs>0) {
				System.out.println("Image Inserted!!");
			}
		} catch (SQLException e) {
			e.getMessage();
			System.out.println("Image is not inserted");
		}
	}
}
public class ImageDatabase {

	public static void main(String[] args) throws SQLException{
		String name = "SYS as SYSDBA";
		String pass = "Satara@123";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Image img = new Image();
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection(url, name, pass);;
		try {
			img.createImageTable(con);
			int choice=0;
			do {
				System.out.print("Enter number: ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					img.ImageInsertion(con);
					break;
					
				case 2:
					img.imageRetrieval(con);
					break;
					
				case 3:
					System.out.println("Exiting");
					break;
					
				default:
					System.out.println("Invalid choice");
					break;
				}
				
			}while(choice!=3);
			
		} catch (Exception e) {
			e.getMessage();
		}
		finally {
			con.close();
			sc.close();
		}
		
		
	}



}
