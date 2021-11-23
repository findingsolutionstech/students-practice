package findingsolutions;

public class ComputerStudent implements OperateAComputer {

	@Override
	public boolean isComputerPluggedIn() {
		return false;
	}

	@Override
	public boolean pressPowerButtonPressed() {
		return false;
	}

	@Override
	public boolean isMonitorTurnedOn() {
		return false;
	}

}
