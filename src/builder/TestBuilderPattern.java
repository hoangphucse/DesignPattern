package builder;

import builder.Student;
public class TestBuilderPattern {

	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder(
				 "500 GB", "2 GB").setBluetoothEnabled(true)
				 .setGraphicsCardEnabled(true).build();
		
		
		Student student = new Student.StudentBuilder(1, "ádfsadf", "ádfasdf", 011, false).setFatherName("toan").build();
		
		
		System.out.println("computer"+student);
		
	

	}

}
