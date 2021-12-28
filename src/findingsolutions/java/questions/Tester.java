package findingsolutions.java.questions;

public class Tester {
  
  public static void main(String[] args) {
    
    InputFieldProvider inputProvider = new InputFieldProvider();
    inputProvider.sendKeys("username");
    System.out.print(inputProvider.changeToLowerCase("ACE"));  
    // expected outcome - ace , add the changeToLowerCase functionality to InputFiledProvider
  }
}
