package findingsolutions;

public class Encapsulationexample {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Tom");
		employee.setAge(25);
		
		System.out.println(employee.getName());
		System.out.println(employee.getAge());

	}

}
