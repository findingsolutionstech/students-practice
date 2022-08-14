package findingsolutions;

public class Banana extends Fruit {
	
	public String printColor() {
       return "yellow";
 }

	@Override
	public String printColor(String color) {
		System.out.println("printing from Banana");
		return color;
	}
}
