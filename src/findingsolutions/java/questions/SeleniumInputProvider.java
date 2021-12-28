package findingsolutions.java.questions;

public abstract class SeleniumInputProvider {
  
  /* Allows sending keys to web elements of different types */
  public abstract void sendKeys(String key);
}

/* Extend this class with a InputFieldProvider class so we can take input for a input field
 */
 