package findingsolutions;

public class VariableConcept {

	public static void main(String[] args) {
		
		int num = 7;
		num += 3;
		System.out.print(num);
		
		int a = 3;
		callMe(a);
		System.out.println("Value of a " + a);

	}

	public static void callMe(int a) {
		a++;
		
	}
}
