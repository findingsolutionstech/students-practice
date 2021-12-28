package findingsolutions.java.questions;

public class InputFieldProvider extends SeleniumInputProvider {

  @Override
  public void sendKeys(String key) {
     System.out.println("Received key " + key); 
  }
  
  public String changeToLowerCase(String text) {
    return text.toLowerCase();
  }
}
