package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class ObjectTypeCastingPractice {

		public static void main(String[]args) {
			//Casting from a subclass(cat) to a superclass(Animal) is called upcasting
			//implicitly or automatically handled by java compilers
			//Animal is super class and cat is subclass
			Animal animal=new Cat("Bobby");
			
			
			//Casting from a superclass (Animal) to subclass (cat) is called downcasting
			//manual casting required
			Cat cat=(Cat)new Animal();
			
			
			List<Integer>nums=new ArrayList<>();
		}
}
