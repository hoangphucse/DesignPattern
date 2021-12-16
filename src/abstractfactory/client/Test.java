package abstractfactory.client;

import abstractfactory.concretefactory.PCFactory;
import factorymethod.Computer;

public class Test {
	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer(new PCFactory("8gb", "122gb", "ádfsdaf"));
		System.out.println("comoputer" + computer);
	}
}
