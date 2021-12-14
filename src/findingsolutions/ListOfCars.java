package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class ListOfCars {

	public static void main(String[] args) {
	
	
	
	System.out.println();
	List setOfCars = new ArrayList<String>();
	setOfCars.add("Charger");
	setOfCars.add("Maserati");
	setOfCars.add("Challenger");
	System.out.println("Size of my set: " + setOfCars.size());
	
	System.out.println("Printing My vehicle");
	
	for(int i = 0; i < setOfCars.size(); i++)  {
		System.out.println( setOfCars.get(i) );
	
	
	}
	
	
	
	
	

}
}
