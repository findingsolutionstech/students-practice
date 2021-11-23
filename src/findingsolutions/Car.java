package findingsolutions;

/*superclass to represent all cars
 * unlike interfaces, you can put in concrete functions
 * 
 */

public abstract class Car {
	
	//not concrete idea/functionality=abstract
	abstract int numberOfWheels();
	
	//concrete functionality
	String paint() {
		return "paint";
	}

}
