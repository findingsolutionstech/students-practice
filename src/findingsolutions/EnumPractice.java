package findingsolutions;

public class EnumPractice {
	
	static final String EXCEL_LOCATION="check storage";
	
	public static void main(String[]args) {
		
		String name="findingsolutions";
		name="finding";
		VolumeLevel speakerVolume= VolumeLevel.LOW;
		
		//comparing items with if-else
		
		if(speakerVolume == VolumeLevel.LOW) {
			System.out.println("phone volume is low");
		}else if(speakerVolume == VolumeLevel.MEDIUM) {
			System.out.println("phone level is medium");
		}else if(speakerVolume == VolumeLevel.HIGH) {
			System.out.println("phone volume level is high");
		}
		
		
		//COMPARING ITEMS WITH SWITCH 
		switch(speakerVolume) {
		case LOW:
			System.out.println("low level");
			break;
		case MEDIUM:
			System.out.println("medium level");
			break;
		case HIGH:
			System.out.println("high level");
			break;
		}
		
	}

}
