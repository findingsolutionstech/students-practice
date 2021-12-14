package findingsolutions;

public class EnumPractice {

	static final String EXCEL_LOCATION = "C:/User/b.xls";
	
	public static void main(String[] args) {
		
		String name = "findingsolution";
		name = "finding";
		
		System.out.println("I am reading from " + EXCEL_LOCATION);
		
		VolumeLevel speakerVolume = VolumeLevel.LOW;
		
		
		/*exactly like doing if-else*/
		if(speakerVolume == VolumeLevel.LOW) {
			System.out.println("Phone speeaker volume is on Low");
		} else if (speakerVolume == VolumeLevel.MEDIUM) {
			System.out.println("Phone speaker volume is on Medium");
		} else if (speakerVolume == VolumeLevel.HIGH) {
			System.out.println("Phone speaker volume is on High");
		}
				
		
		/* comparing items with switch */
		switch (speakerVolume) {
		case LOW:
			System.out.println("Phone speaker volume is low");
			break;
		case MEDIUM:
			System.out.println("Phone speaker volume is Medium");
			break;
		case HIGH:
			System.out.println("Phone speaker volume is High");
			break;
			
		}
		
	
	}

}
