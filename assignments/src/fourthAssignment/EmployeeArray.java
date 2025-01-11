//2. Write program to create array of employee object, and print all employee
//information

package fourthAssignment;
class Employee1{
	int id;
	String name;
	double salary;
	
	Employee1(){
		id=1;
		name = "Srushti";
		salary = 5000;
	}
	Employee1(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class EmployeeArray {

	public static void main(String[] args) {
		Employee1[] emp = new Employee1[5];
		emp[0] = new Employee1();
		emp[1] = new Employee1(2, "Shriyog", 8000);
		emp[2] = new Employee1(3, "Sunil", 6000);
		emp[3] = new Employee1(4, "Suwarna", 7000);
		emp[4] = new Employee1(5, "Anuradha", 8000);
		
		for(Employee1 employee:emp) {
			System.out.println(employee);
		}
	}

}
