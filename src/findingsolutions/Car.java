package findingsolutions;

/*superclass to represent all cars */
/*Unlike interface, you can put in concrete functions */
public abstract class Car {

	// not concrete idea/functionality = abstract
	abstract int numberOfWheels();
	
	// concrete functionality
	String paint() {
		return "paint";
	}
	
	
}
