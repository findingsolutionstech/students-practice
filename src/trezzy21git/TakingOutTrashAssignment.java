package trezzy21git;

public class TakingOutTrashAssignment {
	
	
	//taking out the trash
	//make array and then loop through the array and print everything out
	
	public static void main(String[]args) {
	
		
	String [] steps = new String[] {" 1. get up", "2. walk to the trash", "3. pick up trash",
				"4. take trash outside", "5. dump the trash in the can"};
		
		for(int i=0;i<steps.length;i++) {
		System.out.println(steps[i]);
		
		
	int b=0;
	while(b<steps.length) {
		for( b=0;b<steps.length;b++) {
			System.out.println(steps[b]);
	}
	}
	}
	}
}
	