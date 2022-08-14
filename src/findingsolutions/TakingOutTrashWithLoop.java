package findingsolutions;

public class TakingOutTrashWithLoop {

	
	
	
		public static void main(String[] args) {

			String[] steps = { "Step 1", "Step 2", "Step 3" };
			printingArrayForLoop(steps);
			System.out.println();
			printingArrayWhileLoop(steps);
		}

		static void printingArrayForLoop(String[] steps) {

			System.out.println("Printed with a for loop");
			for (int i = 0; i < steps.length; i++) { // steps.length = 3
				System.out.println(steps[i]);
			}
		}

		static void printingArrayWhileLoop(String[] steps) {

			System.out.println("Printed with a while loop");
			int i = 0;
			while (i < steps.length) {
				System.out.println(steps[i]);
				i++;
			}
		}
	
	
	
	
	
}
