package factorymethod;

public class CarFactory {
	public static Car getCar(String name, String thongTin, String nhaSanXuat, String cauHinh, String tinhNang) {

		if ("toyota".equalsIgnoreCase(name))
			return new ToyotaCar(thongTin, cauHinh, tinhNang, nhaSanXuat);
		if ("honda".equalsIgnoreCase(name))
			return new HondaCar(thongTin, cauHinh, tinhNang, nhaSanXuat);
		if ("nexus".equalsIgnoreCase(name))
			return new NexusCar(thongTin, cauHinh, tinhNang, nhaSanXuat);

		return null;
	}

}
