
/*
* Dogs are one of pet animals and its a sub class or child class for animal class also we can call it base class.
* It inherit from animal class method sleep() and eat() also has its own default constructor 
*/
package AnimalClass;

public class Dogs extends AnimalClass {
	public Dogs()
	{
		//Super();
		System.out.println("My Dogs Class created here....");
	}
	@Override
	public String sleep() {
		return "Dogs sleeps 12 to 14 hours";
	}
	@Override
	public String eat() {
		return "Dogs eats in a day one or twice";
	}
	public String barks(){
		return "Dogs barks like \"woof-woof...\",";
	}
	public String search(){
		return "Dogs has an amazing sense of smell and direction...";
	}
	

}
