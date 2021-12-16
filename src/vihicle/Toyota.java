package vihicle;

public class Toyota extends Car{
	private String cauHinh;
	private String nhaSanXuat;
	private String tinhNang;
	
	
	public Toyota(String cauHinh, String nhaSanXuat, String tinhNang) {
		this.cauHinh = cauHinh;
		this.nhaSanXuat = nhaSanXuat;
		this.tinhNang = tinhNang;
	}
	
	@Override
	public String getCauHinh() {
		return this.cauHinh;
	}
	@Override
	public String getTinhNang() {
		return this.tinhNang;
	}
	@Override
	public String getNhaSanXuat() {
		return this.nhaSanXuat;
	}
}
