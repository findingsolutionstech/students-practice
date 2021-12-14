        package findingsolutions;

// this is meant to be a subclass - specific representation of a particular animal
// use the extends keyword to perform inheritance (here cat inherits all functions of animal 

public class Cat extends Animal {
	
	/*unless explicitly declared, Java wont allow you to use the default style
	 * of constructor where it takes no inputs, once you have overloaded it
	 * public cat() {}
	 * 
	 */
	
	/* function overloading - reuse the same name, but change something else
	 * something else can be number of input you take, type of input you take
	 */

	public Cat(String name) {}
	
	public Cat(String name, int numOfLegs) {}
	
	public Cat(int numOfLegs) {}

	/* function overriding -override the logic from superclass
	 * 
	 */
	@Override
	public void noiseTheAnimalMakes() {
		System.out.println("The animal meows");
	}
}
