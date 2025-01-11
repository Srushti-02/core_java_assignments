//1. Create an abstract class Instrument which is having the abstract function
//play. Create three more sub classes from Instrument which is Piano, Flute,
//Guitar. Override the play method inside all three classes printing a message .
//“Piano is playing tan tan tan tan ” for Piano class
//“Flute is playing toot toot toot toot” for Flute class
//“Guitar is playing tin tin tin ” for Guitar class
//You must not allow the user to declare an object of Instrument class.
//Create an array of 10 Instruments.
//Assign different type of instrument to Instrument reference.
//Check for the polymorphic behavior of play method.
//Use the instanceof operator to print that which object stored at which index of
//instrument array.

package sixthAssignment;

abstract class Instrument{
	abstract void play();
}

class Piano extends Instrument{
	@Override
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	@Override
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	@Override
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}

public class InstrumentDemo {

	public static void main(String[] args) {
		Instrument instrument[] = new Instrument[10];
		instrument[0] = new Piano();
		instrument[1] = new Flute();
		instrument[2] = new Guitar();
		instrument[3] = new Piano();
		instrument[4] = new Flute();
		instrument[5] = new Guitar();
		instrument[6] = new Piano();
		instrument[7] = new Flute();
		instrument[8] = new Guitar();
		instrument[9] = new Piano();
		
		for(int i = 0; i < 10; i++) {
			instrument[i].play();
			if(instrument[i] instanceof Piano) {
				System.out.println("Piano's instance is at "+i);
			}
			else if(instrument[i] instanceof Flute) {
				System.out.println("Flute's instance is at "+i);
			}
			if(instrument[i] instanceof Guitar) {
				System.out.println("Guitar's instance is at "+i);
			}
		}
	}

}
