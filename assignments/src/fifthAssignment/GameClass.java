//1. Write class game{ }
//class boardgame extends game{ }
//class chess extends boardgame{ }
//class gamedemo{
//public static void main(String[] args) {
//chess ch=new chess(); }
//} (
//Note: Write only default constructors in each class with specific information .
//See
//the order of constructors invoked when chess object is created)

package fifthAssignment;

class Game{
	Game(){
		System.out.println("Game class constructor invoked");
	}
}
class BoardGame extends Game{
	BoardGame(){
		System.out.println("BoardGame class constructor invoked");
	}
}
class Chess extends BoardGame{
	Chess(){
		System.out.println("Chess class constructor invoked");
	}
}
public class GameClass {

	public static void main(String[] args) {
		new Chess();
	}

}
