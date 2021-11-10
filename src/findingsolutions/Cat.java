package findingsolutions;

//this is meant to be subclass- specific representation of a particular animal
//use the extends keyword to perform inheritance (here cat inherits all functions of animal)

public class Cat extends Animal{
	//unless explicitly declared,Java wont allow you to use the default style
	//of constructor where it takes no inputs once you overloaded it EXAMPLE > public Cat();
	
	public Cat() {}
	
	//function overloading
	//overloading - same method signature different parameters
	//overriding - when a subclass has a method from parent class 
	public Cat(String name) {
		
	}
	
	public Cat(String name , int numOfLegs) {
		
	}
	
	public Cat(int numOfLegs) {
		
	}
	
	//function Override- overriding the logic from superclass
	
	public void noiseTheAnimalMakes() {
		System.out.println("The animal makes a high-pitched noise");
	}
	
	

}
