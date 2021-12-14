package findingsolutions;

public class ObjectTypecastingPractice {

	public static void main(String[] args) {

		
		// Casting from a subclass (Cat) to a superclass
		// implicitly or automatically handled by Java complier
		Animal animal = new Cat("Bobby");
		animal.noiseTheAnimalMakes();
		
		// Casting from a superclass (Animal) to a subclass (Cat) is called downcasting
		// manual casting required
		Cat cat = (Cat) new Animal();
		
	
	}

}
