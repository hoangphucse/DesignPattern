package state;

public class OrderedState implements PakageState {

	@Override
	public void next(Pakage pkg) {
		pkg.setState(new DeliveredState());

	}

	@Override
	public void prev(Pakage pkg) {
		System.out.println("The package is in its root state.");

	}

	@Override
	public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
	}

}
