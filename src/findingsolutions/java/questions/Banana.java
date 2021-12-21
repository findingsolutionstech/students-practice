package findingsolutions.java.questions;

public class Banana extends Fruit {

  @Override
  String printColor(String color) {
    System.out.println("printing from Banana");
    return color;
  }
}