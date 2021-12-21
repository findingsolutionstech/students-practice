package findingsolutions.java.questions;

public class Apple extends Fruit {

	@Override
	String printColor(String color) {
	  System.out.println("printing from Apple");
	  return color;
	}
}