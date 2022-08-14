package findingsolutions;

public class polymorphismPractice {
	
	public static void main(String[] args) {
		
		
		
		Animal animal = new Animal();
		animal.noiseTheAnimalMakes();
		
		Animal cat = new Cat("Bobby"); // Cat object
		cat.noiseTheAnimalMakes();
		
		System.out.println(); 
	}
}
