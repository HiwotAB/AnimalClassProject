/*
* Rabbit are one of pet animals and its a sub class or child class for animal class also we can call it base class.
* It inherit from animal class method sleep() and eat() also has its own default constructor 
*/
package AnimalClass;

public class Rabbit extends AnimalClass {

	public Rabbit ()
	{
		//Super();
		System.out.println("My Rabit Class created here....");
	}
	@Override
	public String sleep() {
		return "Rabit sleeps 12 to 14 hours";
	}
	@Override
	public String eat() {
		return "Rabit eats plant-based diet and do not eat meat";
	}
	public String teeth(){
		return "Rabit has 28 teeth....";
	}
	public String jumps(){
		return "Rabbit can jump over 2 ft (0.6 m) high...";
	}

}
