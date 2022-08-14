import findingsolutions.Apple;
import findingsolutions.Banana;
import findingsolutions.Fruit;

public class InheritencePractice {

	public static void main(String[] args) {

		// superclass - Fruit
		// subclasses - Banana, Apple
		// input - logic - output
		Fruit banana = new Banana();
		System.out.println("The banana is" + banana.printColor("yellow"));
		
		Fruit apple = new Apple();
		System.out.println("The apple is" + apple.printColor("red"));
		
		//Second apple is green
		Fruit apple2 = new Apple();
		System.out.println("The second apple is" + apple2.printColor("green"));
	}

}
