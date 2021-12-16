package vihicle;

public class ToyotaFactory implements CarAbstractFactory {
	private String cauHinh;
	private String nhaSanXuat;
	private String tinhNang;

	public ToyotaFactory(String cauHinh, String nhaSanXuat, String tinhNang) {
		this.cauHinh = cauHinh;
		this.nhaSanXuat = nhaSanXuat;
		this.tinhNang = tinhNang;
	}

	@Override
	public Car createCar() {
		return new Honda(cauHinh, nhaSanXuat, tinhNang);
	}
}
