package state;

public class ReceivedState implements PakageState {

	@Override
	public void next(Pakage pkg) {
        System.out.println("This package is already received by a client.");
		
	}

	@Override
	public void prev(Pakage pkg) {
        pkg.setState(new DeliveredState());
		
	}

	@Override
	public void printStatus() {
        System.out.println("This package is already received.");
		
	}



}
