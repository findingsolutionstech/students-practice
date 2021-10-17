package findingsolutions.java;

public class TakingOutTrash {

	public static void main(String[] args) {

		String[] steps = new String[] { "Step 1", "Step 2", "Step 3" }; // 0th, 1th, 2th item/element

		printingArray(steps);
		System.out.println();
		printingReverse(steps);
		System.out.println();
		printingReverseAlternate(steps);
	}

	static void printingArray(String[] steps) {
		for (int i = 0; i < steps.length; i++) { // steps.length = 3
			System.out.println(steps[i]);
		}
	}

	static void printingReverse(String[] steps) {
		for (int i = 0; i < steps.length; i++) {
			System.out.println(steps[steps.length - i - 1]);
		}
	}

	static void printingReverseAlternate(String[] steps) {
		for (int i = steps.length - 1; i >= 0; i--) {
			System.out.println(steps[i]);
		}
	}

}
