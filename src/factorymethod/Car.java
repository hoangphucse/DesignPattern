package factorymethod;

public abstract class Car {
	public abstract String getThongTin();

	public abstract String getCauHinh();

	public abstract String getTinNang();
	
	public abstract String getNhaSanXuat();

	@Override
	public String toString() {
		return "Car [getThongTin()=" + getThongTin() + ", getCauHinh()=" + getCauHinh() + ", getTinNang()="
				+ getTinNang() + ", getNhaSanXuat()=" + getNhaSanXuat() + "]";
	}
	
	
	
	
}
