package findingsolutions.java;

public class EnumPractice {

	/* a single constant defining where our Excel file is */
	static final String EXCEL_LOCATION = "C:/User/b.xls";

	public static void main(String[] args) {

		VolumeLevel speakerVolume = VolumeLevel.LOW;

		/* comparing items with if-else */
		if (speakerVolume == VolumeLevel.LOW) {
			System.out.println("Phone speaker volume is on Low");
		} else if (speakerVolume == VolumeLevel.MEDIUM) {
			System.out.println("Phone speaker volume is on Medium");
		} else if (speakerVolume == VolumeLevel.HIGH) {
			System.out.println("Phone speaker volume is on High");
		}

		/* comparing items with switch */
		switch (speakerVolume) {
		case LOW:
			System.out.println("Phone speaker volume is on Low");
			break;
		case MEDIUM:
			System.out.println("Phone speaker volume is on Medium");
			break;
		case HIGH:
			System.out.println("Phone speaker volume is on High");
			break;
		}
	}

}
