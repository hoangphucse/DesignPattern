package state;

public class Pakage {
	
	private PakageState state = new OrderedState();
	
	public PakageState getState() {
		return state;
	}

	public void setState(PakageState state) {
		this.state = state;
	}

	public void previousState() {
		state.next(this);
	}

	public void nextState() {
		state.prev(this);
	}

	public void printSatus() {
		state.printStatus();
	}
}
