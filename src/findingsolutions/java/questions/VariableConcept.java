package findingsolutions.java.questions;

public class VariableConcept {
  
  int num = 5;
  
  public static void main(String[] args) {
    
    int num = 7;
    num += 3; // num = num + 3
    System.out.println(num);
    
    int a = 3;
    callMe(a);
    System.out.println("Value of a " + a);
  }
  
  public static void callMe(int a) {
    a++;
    System.out.println("Value of a within method " + a);
  }

}
