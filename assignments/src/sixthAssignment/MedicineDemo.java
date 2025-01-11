//2. Create a class Medicine to represent a drug manufactured by a
//pharmaceutical company. Provide a function displayLabel() in this class to print
//Name and address of the company.
//Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the
//displayLabel() function in each of these classes to print additional information
//suitable to the type of medicine. For example, in case of tablets, it could be
//“store in a cool dry place”, in case of ointments it could be “for external use
//only” etc.
//Create a class TestMedicine. Write main function to do the following:
//Declare an array of Medicine references of size 10
//Create a medicine object of the type as decided by a randomly generated integer
//in the range 1 to 3.
//Refer Java API Documentation to find out random generation feature.
//Check the polymorphic behavior of the displayLabel() method.

package sixthAssignment;
import java.util.Random;
class Medicine{
	String name;
	String address;
	Medicine(String name, String address){
		this.name=name;
		this.address=address;
	}
	void displayLabel() {
		System.out.println("Label = "+name+", "+address);
	}
}

class Tablet extends Medicine{
	Tablet(String name, String address) {
		super(name, address);
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Store in a cool dry place");
	}
}
class Syrup extends Medicine{
	Syrup(String name, String address) {
		super(name, address);
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Store away from sunlight");
	}

}

class Ointment extends Medicine{
	Ointment(String name, String address) {
		super(name, address);
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("For external use only");
	}
}

public class MedicineDemo {

	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[10];
		
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			int choice = random.nextInt(3)+1;
			switch(choice){
			case 1:
				medicine[i] = new Tablet("Pharma Inc", "Pimpri Chinchwad");
				break;
			case 2:
				medicine[i] = new Syrup("Dr. Reddy", "Balewadi");
				break;
			case 3:
				medicine[i] = new Ointment("Dr. Reddy", "Pune");
				break;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Medicine " + (i+1) + ":");
			medicine[i].displayLabel();
			System.out.println();
		}
	}

}
