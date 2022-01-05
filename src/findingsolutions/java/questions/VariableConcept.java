package findingsolutions.java.questions;

public class VariableConcept {
  
  int num = 5;
  
  public static void main(String[] args) {
    
    int num = 7;
    num += 3; // num = num + 3
    System.out.println(num);      // local variable takes precedent over global one so this results in 10 not 5
    
    int a = 3;
    callMe(a);
    System.out.println("Value of a " + a);
  }
  
  public static void callMe(int a) {
    a++;
    System.out.println("Value of a within method " + a);  // again this a variable is local to this method
  }

}
