package findingsolutions;

public class Banana extends Fruit {
	@Override
	public String printColor() {
       return "yellow";
 }

	@Override
	public String printColor(String color) {
		return color;
	}
}
