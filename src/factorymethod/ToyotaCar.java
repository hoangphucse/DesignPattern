package factorymethod;

public class ToyotaCar extends Car {
	private String thongTin;
	private String cauHinh;
	private String tinhNang;
	private String nhaSanXuat;
	
	
	public ToyotaCar(String thongTin, String cauHinh, String tinhNang, String nhaSanXuat) {
		this.thongTin = thongTin;
		this.cauHinh = cauHinh;
		this.tinhNang = tinhNang;
		this.nhaSanXuat = nhaSanXuat;
	}
	
	@Override
	public String getThongTin() {
		return this.thongTin;
	}
	@Override
	public String getCauHinh() {
		return this.cauHinh;
	}
	@Override
	public String getTinNang() {
		return this.tinhNang;
	}
	@Override
	public String getNhaSanXuat() {
		return this.nhaSanXuat;
	}
}
