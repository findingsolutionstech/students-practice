package findingsolutions.java;

public class ComputerStudent implements OperateAComputer{

	@Override
	public boolean isComputerPluggedIn() {
		return true;
	}

	@Override
	public boolean isPowerButtonPressed() {
		return true;
	}

	@Override
	public boolean isMonitorTurnedOn() {
		return true;
	}

}
