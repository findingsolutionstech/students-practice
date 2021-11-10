package findingsolutions.java;

public class ObjectTypecastingPractice {

	public static void main(String[] args) {

		// Casting from a subclass (Cat) to a superclass (Animal) is called upcasting
		// implicitly or automatically handled by Java compiler
		Animal animal = new Cat("Bobby");
		animal.noiseTheAnimalMakes();

		// Casting from a superclass (Animal) to a subclass (Cat) is called downcasting
		// manual casting required with ()
		Cat cat = (Cat) animal;
		cat.noiseTheAnimalMakes();
	}

}
