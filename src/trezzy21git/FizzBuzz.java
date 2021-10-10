package trezzy21git;

public class FizzBuzz {
	public static void main(String[]args) {
		
		
		//fizz buss- write a program that prints numbers 1-to 30 but if 
		//but for multiples of 3 print "fizz instead of number and buzz for multiples of 5
		//if there are multiples of both,print "fizzbuzz"
		
		for(int i=1;i<=30;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
			}else if (i%5==0) {
				System.out.println("buzz");
			}else if(i%3==0){
				System.out.println("fizz");
			}else {
				System.out.println(i);
			} 
		
		}
		
	}

	}	

