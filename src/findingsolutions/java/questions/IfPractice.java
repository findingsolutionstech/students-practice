package findingsolutions.java.questions;

public class IfPractice {

  public static void main(String[] args) {
    int age = 20;
    System.out.println("Person is eligible? " + eligibleToGetFullLicense(age));
  }

  /*
   * Write a method that determines if person is eligible for a full license
   * eligibility requirement: age should be at least 18
   */
  public static boolean eligibleToGetFullLicense(int age) {
    if (age >= 18) {
      return true;
    }
    return false;
  }

}
