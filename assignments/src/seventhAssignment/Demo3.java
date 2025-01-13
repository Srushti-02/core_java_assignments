package seventhAssignment;
import pack1.Student;
import pack2.Batch;

class printData{
	Student st = new Student(1, "Srushti", 23);
	Batch b = new Batch("NESS", "B", 1);
	@Override
	public String toString() {
		return "printData [st=" + st.name + "  "+ st.age +" "+ st.rollNo +", b=" + b.schoolName +" "+b.division+" "+b.batch+ "]";
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		printData pd = new printData();
		System.out.println(pd);
	}

}
