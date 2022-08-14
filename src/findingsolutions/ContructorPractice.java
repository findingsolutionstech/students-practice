package findingsolutions;

public class ContructorPractice {

	static final String URL = "mercurytour.com";
	
	public static void main(String[] args) {
		
		TableOfContents table = new TableOfContents(5);
		System.out.print(table.getNumOfChapters());
		
		//constants use case
		System.out.println(URL);
		
		//variable
		String url = "mercurytour.com";
		url = "google.com";
		url = "amazon.com";
		System.out.println(url);
		
		int i = 5;
		int j = 0;
		j++;
		i--; // i = i - i;
		System.out.println(i);
		
	}
}
