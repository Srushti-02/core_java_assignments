//1. Write an Employee class with id, name and dob(Contained Object..
//Containment)with Default and parameterised constructor & toString()..

package fourthAssignment;
class DOB{
	private int day;
	private int month;
	private int year;
	
	DOB(){
		day = 02;
		month = 07;
		year = 2002;
	}
	DOB(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return day + "/" + month + "/" + year ;
	}
	
}
class Employee{
	int id;
	String name;
	DOB dob = new DOB();
	
	Employee(){
		id = 1;
		name = "Srushti";
	}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee \nid=" + id + " || name=" + name + " || dob=" + dob ;
	}
	
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp);
	}

}
