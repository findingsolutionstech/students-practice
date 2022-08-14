package findingsolutions;

public abstract class SeleniumInputProvider {

	
	//Allows sending keys to web elements of different types
	public abstract void sendKeys(String key);
	
}

// Extend this class with a InputFieldProvider class so we take keys for a input field 
// Received key + key

