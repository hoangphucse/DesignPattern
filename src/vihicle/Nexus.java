package vihicle;

public class Nexus extends Car{
	private String cauHinh;
	private String nhaSanXuat;
	private String tinhNang;
	
	public Nexus(String cauHinh, String nhaSanXuat, String tinhNang) {
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
