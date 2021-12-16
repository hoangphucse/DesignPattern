package vihicle;

public class CarFactory {
	public static Car getCar(CarAbstractFactory car) {
		return car.createCar();
	}
}
