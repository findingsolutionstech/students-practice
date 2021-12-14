package findingsolutions;

/*
 * 
 * Use cases:
 * when defining a library like list where you want the subclass
 * to provide concrete logic
 * 
 * 
 */
public interface OperateAComputer {

	/*
	 * Interface methods are by default abstract and public
	 */
	boolean isComputerPluggedIn(); 
    boolean isPowerButtonPressed();
	boolean isMonitorTurnedOn();
	
	
}
