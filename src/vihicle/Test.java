package vihicle;



public class Test {
	public static void main(String[] args) {
		Car car = CarFactory.getCar(new HondaFactory("asdfasdf","asdfasdf", "asdfasdfa"));
		System.out.println(car);
	}
}
