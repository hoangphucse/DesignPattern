package vihicle;

public abstract class Car {
	public abstract String getCauHinh();
	public abstract String getTinhNang();
	public abstract String getNhaSanXuat();
	@Override
	public String toString() {
		return "Car [getCauHinh()=" + getCauHinh() + ", getTinhNang()=" + getTinhNang() + ", getNhaSanXuat()="
				+ getNhaSanXuat() + "]";
	}
	
	
	
}
