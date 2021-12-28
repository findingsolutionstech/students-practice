package findingsolutions.java.questions;

public class OperatorReview {
  
  public static void main(String[] args) {
    int result = difference(2,3);
    System.out.println("Difference is " + result);
    
    evenNumbersBetweenZeroAndTwelve();
  }
  
  /* Write a method that returns difference(-) between two numbers/integers */
  public static int difference(int x, int y) {
    return x-y;
  }
  
  /* Write a method that prints out even numbers 
   * between zero and twelve excluding zero and twelve (0<even<12)
   * 2 4 6 8 10
   * */
  public static void evenNumbersBetweenZeroAndTwelve() {
    for(int i = 1; i < 12; i++) {
      /*
       * if(i == 0) { continue; }  // use continue to skip an iteration if you want to start at 0
       */
      if(i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
