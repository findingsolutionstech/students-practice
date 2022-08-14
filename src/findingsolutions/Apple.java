package findingsolutions;

public class Apple extends Fruit {
	
	
	
	public String printColor() {
	       return "red";
	 }
     
	
	@Override
	public String printColor(String color) {
		System.out.println("printing from Apple");
		
		return color;
	}
}
