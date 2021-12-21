package findingsolutions.java.questions;

import java.util.ArrayList;
import java.util.List;

public class AnotherExceptionPractice {

  public static void main(String[] args) {

    try {
      callMe();
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Ran into the usual exception: " + e.getLocalizedMessage());
    }
    
    try {
      callMeAgain();
    } catch (NullPointerException e) {
      System.out.println("Ran into another exception: " + e.getLocalizedMessage());
    }
    System.out.println("We are finished executing !!");
  }

  public static void callMe() {
    List<Integer> nums = new ArrayList<>();
    System.out.println(nums.get(0));
  }

  public static void callMeAgain() {
    TestClass testClass = null;
    testClass.getName();
  }
}
