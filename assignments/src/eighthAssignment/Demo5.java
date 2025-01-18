package eighthAssignment;
import java.util.Scanner;

class IncorrectAgeException extends Exception{
	public IncorrectAgeException(String m) {
		super(m);
	}
}
class IncorrectNationalityException extends Exception{
	public IncorrectNationalityException(String m){
		super(m);
	}
}

class Voter{
	int age;
	int nationality;
	
	void check() throws IncorrectAgeException, IncorrectNationalityException{
		if(nationality<0) {
			throw new IncorrectNationalityException("Wrong Nationality");
		}
		if(age < 18) {
			throw new IncorrectAgeException("You are below 18.");
		}
	}
	
	@Override
	public String toString() {
		return "Voter [age=" + age + ", nationality=" + nationality + "]";
	}


	Voter(int age, int nationality){
		this.age = age;
		this.nationality = nationality;
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int nationality = sc.nextInt();
		sc.close();
		Voter voter = new Voter(age, nationality);
		System.out.println(voter);
		try {
			voter.check();
		} catch (IncorrectAgeException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectNationalityException e) {
			System.out.println(e.getMessage());
		}
	}

}
