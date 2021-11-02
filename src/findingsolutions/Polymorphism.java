package findingsolutions;

public class Polymorphism {
	public static void main(String[]args) {
		
		Animal animal=new Animal();
		
		animal.noiseTheAnimalMakes();
		
		Animal cat=new Cat();  //cat object
		
		cat.noiseTheAnimalMakes();
	}

}
