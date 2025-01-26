package twelvthAssignment;

//10.Write a java program to serialize the Employee
//objects(id,name,salary,address,email,contact) and restrict serialization of email
//and contact (use ObjectInputStream,ObjectOutputStream,transient)

import java.io.*;

class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int salary;
	String address;
	String email;
	int contact;
	
	public Employee(int id, String name, int salary, String address, String email, int contact){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.email=email;
		this.contact=contact;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", email="
				+ email + ", contact=" + contact + "]";
	}
	
	
}
public class EmployeeSerialization {
	static String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
	static void serializeEmployee(Employee emp) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath+"Student.txt"));
		oos.writeObject(emp);
		oos.close();
	}
	static void deserializeEmployee() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath+"Student.txt"));
		System.out.println((Employee) ois.readObject());
		ois.close();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee(1, "Srushti", 10, "pune", "shr", 95);
		serializeEmployee(emp);
		deserializeEmployee();
	}

}
