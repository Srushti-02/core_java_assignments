package thirdAssignment;

//5. Write a singleton class(Singleton class is is a class which has only one object)
class Single{
	private static final Single instance = new Single();  
	private Single(){
		System.out.println("Singleton class is created");
	}
	public static Single getInstance() {  
        return instance;  
    }  
	
}
public class SingletonClass {

	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		if(s1 == s2) {
			System.out.println("both are same objects");
		}
	}

}
