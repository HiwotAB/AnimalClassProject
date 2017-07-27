/*
 * This is the main method class and we used to create and instanciation the class by object and we have two classes 
 * Dogs and AnimalClass
* 
*/
package AnimalClass;

public class AnimalMainMethod {

	public static void main(String[] args) {
		AnimalClass myAnimalClass = new AnimalClass();
		System.out.println(myAnimalClass.eat());
		System.out.println(myAnimalClass.sleep());
		
		System.out.println("******************************");
		Dogs myDogs=new Dogs();
		System.out.println(myDogs.eat());
		System.out.println(myDogs.sleep());
		System.out.println(myDogs.barks());
		System.out.println(myDogs.search());
		
		System.out.println("********************************");
		Rabbit myRabbit=new Rabbit();
		System.out.println(myRabbit.eat());
		System.out.println(myRabbit.sleep());
		System.out.println(myRabbit.jumps());
		System.out.println(myRabbit.teeth());
		

	}

}
