package abstractfactory.client;

import abstractfactory.abstractfactory.ComputerAbstractFactory;
import factorymethod.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory computer) {
		return computer.createComputer();
	}
}
