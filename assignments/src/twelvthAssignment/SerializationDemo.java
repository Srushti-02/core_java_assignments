package twelvthAssignment;

import java.io.*;

//9. Write a java program to serialize the Student objects and deserialize
//it(Serializaion)

class Student implements Serializable{
	int roll_no;
	String name;
	char div;
	
	public Student(int roll_no, String name, char div) {
		this.roll_no = roll_no;
		this.name = name;
		this.div = div;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", div=" + div + "]";
	}
	
}

public class SerializationDemo {
	static String filePath="D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
	static void serializeStudent(Student student) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath+"Student.txt"));
		oos.writeObject(student);
		oos.close();
	}
	static void deserializeStudent() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath+"Student.txt"));
		System.out.println((Student) ois.readObject());
		ois.close();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student(1, "Srushti", 'A');
		serializeStudent(student);
		deserializeStudent();
	}

}
