package findingsolutions;

public class IfPractice {


	public static void main(String[] args) {
       int AGE = 20;
		System.out.println("Person is eligibile? " + eligibleToGetFullLicense(AGE));
	}
//Write a method that determines if person is eligible for a full license eligibility requirement: age should be at least 18
	public static boolean eligibleToGetFullLicense(int AGE) {
		
		if (AGE >=18) {
			return true;
		} 
		return false;
	}
}
