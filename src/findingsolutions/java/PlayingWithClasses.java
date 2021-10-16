package findingsolutions.java;

public class PlayingWithClasses {
	
	public static void main(String[] args) {
		
    Vehicle carA = new Vehicle("Toyota", "silver");
    System.out.printf("Buy a %s %s\n", carA.getColor(), carA.getName());
    Vehicle carB = new Vehicle("Ford", "blue");
    System.out.printf("Buy a %s %s\n", carB.getColor(), carB.getName());
	}

}
