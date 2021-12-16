package vihicle;

public class HondaFactory implements CarAbstractFactory{
	
	private String cauHinh;
	private String nhaSanXuat;
	private String tinhNang;
	
	
	public HondaFactory(String cauHinh, String nhaSanXuat, String tinhNang) {
		this.cauHinh = cauHinh;
		this.nhaSanXuat = nhaSanXuat;
		this.tinhNang = tinhNang;
	}


	@Override
	public Car createCar() {
		return new Honda(cauHinh, nhaSanXuat, tinhNang);
	}

}
