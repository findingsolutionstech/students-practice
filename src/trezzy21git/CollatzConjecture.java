package trezzy21git;

public class CollatzConjecture {
	public static void main(String[]args) {
		/*take any number between 9 and 21
		 * if number is even, divide it by 2
		 * if number is odd, divide by3, then add1
		 * repeat and keep printing till youll eventually reach 1
		 */
		
		collatzPrintWhileLoop(21);
		collatzPrintForLoop(21);
	}
	
	//now collatzPrint will need to pass an integer above
	//input- number
	//processing - logic
	//output - void (return nothing)
	
	static void collatzPrintWhileLoop(int num) {
		System.out.println(num);
		int i=num;
		while(i>1) {
			if(num % 2 == 0 ) {
				num=num/2;
		}else if(num % 2 !=0) { //!= not equals
			num=num/3+1;
		}
			//repeat and keep printing till you reach1
			System.out.println(num);
		i=num;	
		}
	}
	
	
	//using for loop same problem
	
	static void collatzPrintForLoop(int num) {
		for(int i = num;i>1;i=num) {
			if(num % 2 == 0 ) {
				num=num/2;
		}else if(num % 2 !=0) { //!= not equals
			num=num/3+1;
		}
			//repeat and keep printing till you reach1
			System.out.println(num);
			
		}
		
		
		
		}
	}


