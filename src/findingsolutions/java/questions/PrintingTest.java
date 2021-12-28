package findingsolutions.java.questions;

public class PrintingTest {
  
  public static void main(String[] args) {
    printMe();
    printMeLongLine();
  }
  
  /*Write a method to print following lines on the console
   * 
   * Today is Java review day
   * Today is "Java review" day
   * My workspace is in C:\ 
   * */
  public static void printMe() {
   System.out.println("Today is Java review day");
   System.out.println("Today is \"Java review\" day");    // \" to handle double quotes
   System.out.println("My workspace is in C:\\");         // \\ to handle the slash itself
  }
  
  /* \n is equivalent to hitting Enter on your keyboard */
  public static void printMeLongLine() {
    System.out.print("Today is Java review day.\nToday is \"Java review\" day.\nMy workspace is in C:\\"); 
   }
}
