package trezzy21git;

public class Test {
	public static void main(String[]args) {
		//int[]yo=new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	//	for(int i=1;i<=30;i++) {
		//	System.out.println(i);
	//	}
		
		//fizz buss- write a program that prints numbers 1-to 30 but if 
		//but for multiples of 3 print "fizz instead of number and buzz for multiples of 5
		//if there are multiples of both,print "fizzbuzz"
		
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				System.out.println("fizz");
				
			if(i%5==0) {
				System.out.println("buzz");
			}
			
			if(i%5==0 & i%3==0) {
				System.out.println("fizzbuzz");
			}else {
				System.out.println(i);
			}
		
	}

	}	
}
}
