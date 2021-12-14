package findingsolutions.java.questions;

public class InheritencePractice {

  public static void main(String[] args) {
	
    // superclass - Fruit
    // subclasses - Banana, Apple
	// input - logic - output
	
    Fruit banana = new Banana();
    System.out.println("A banana is " + banana.printColor("yellow"));
	
    Fruit apple = new Apple();
    System.out.println("First apple is " + apple.printColor("red"));
	
    // Second apple is green
    Fruit apple2 = new Apple();
    System.out.println("Second apple is " + apple2.printColor("green"));
  }
}
