package findingsolutions;

public class Apple extends Fruit {
	@Override
	public String printColor() {
	       return "red";
	 }
     
	
	@Override
	public String printColor(String color) {
		return color;
	}
}
