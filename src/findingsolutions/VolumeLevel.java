package findingsolutions;

/*
 * used to group together constants that have some meaning when discussed together
 * make it clearer for the programmer to define concepts in plain english
 * than just using numbers
 */

public enum VolumeLevel {
	LOW(0), MEDIUM(5), HIGH(10);
	
	private int volumeInNumberForamt;

	VolumeLevel(int volumeInNumberFormat) {
		// TODO Auto-generated constructor stub
	}

}
