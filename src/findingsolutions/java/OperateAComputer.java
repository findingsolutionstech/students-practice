package findingsolutions.java;

/*
 * Use cases:
 * when defining a library like List where you want the subclass
 * to provide concrete logic
 * 
 * use to represent action to take
 * */
public interface OperateAComputer {
	
	/* Interface methods are by default abstract and public*/
	boolean isComputerPluggedIn();
	boolean isPowerButtonPressed();
	boolean isMonitorTurnedOn();
	
}
