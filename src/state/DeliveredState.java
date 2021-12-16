package state;

public class DeliveredState implements PakageState{

	@Override
	public void next(Pakage pkg) {
	     pkg.setState(new ReceivedState());		
	}

	@Override
	public void prev(Pakage pkg) {
        pkg.setState(new OrderedState());
		
	}

	@Override
	public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
		
	}

}
