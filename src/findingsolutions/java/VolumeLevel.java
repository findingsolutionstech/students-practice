package findingsolutions.java;

/* used to group together constants that have some meaning when
 * discussed together
 * make it clearer for the programmer to define concepts in plain English
 * than just using numbers
 * */
public enum VolumeLevel {
	  LOW (0),
	  MEDIUM (5),
	  HIGH (10);
	
	private int volumeInNumberFormat;

	VolumeLevel(int volumeInNumberFormat) {
		this.volumeInNumberFormat = volumeInNumberFormat;
	}
}
