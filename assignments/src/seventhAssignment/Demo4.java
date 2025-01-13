package seventhAssignment;
import com.user.*;

class GreaterTest{
	Greeter greet = new Greeter("Srushti");
	Greeter greet1 = new Greeter("Shriyog");
	Advisor advise = new Advisor();
	public void show(){
		greet.sayHello();
		advise.getAdvice();
		greet.sayGoodBye();
		greet1.sayHello();
		advise.getAdvice();
		greet1.sayGoodBye();
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		GreaterTest gt = new GreaterTest();
		gt.show();
	}

}
