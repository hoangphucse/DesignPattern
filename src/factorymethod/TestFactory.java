package factorymethod;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		
		Car toyotaCar = CarFactory.getCar("toyota", "thongtin1", "nhasx1", "cauhinh1", "tinhnang");
		Car nexusCar = CarFactory.getCar("nexus", "thongtin2", "nhasx2", "cauhinh2", "tinhnang");
		Car hondaCar = CarFactory.getCar("honda", "thongtin3", "nhasx3", "cauhinh3", "tinhnang");
		
		 System.out.println("Factory PC Config::"+pc);
		 System.out.println("Factory Server Config::"+server);
		 
		 System.out.println("toyotaCar::"+toyotaCar);
		 System.out.println("nexusCar::"+nexusCar);
		 System.out.println("hondaCar::"+hondaCar);

	}

}
