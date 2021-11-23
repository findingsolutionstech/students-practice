package findingsolutions;

/*use cases:
 * when defining a library like list where you want the subclass
 * to provide concrete logic
 * 
 * 
 * use to represent action to take
 * 
 */

public interface OperateAComputer {

	//interface methods are by default abstract and public
	boolean isComputerPluggedIn();
	boolean pressPowerButtonPressed();
	boolean isMonitorTurnedOn();
	
	

}
