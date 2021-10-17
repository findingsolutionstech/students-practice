package findingsolutions.java;

public class TakingOutTrashReverse {

	public static void main(String[] args) {

		String[] steps = { "Step 1", "Step 2", "Step 3" }; // 0th, 1th, 2th item/element

		printingReverse(steps);
		System.out.println();
		printingReverseAlternate(steps);
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
