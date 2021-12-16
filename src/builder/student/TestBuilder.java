package builder.student;

public class TestBuilder {
	public static void main(String[] args) {
		StudentBuilder studentBuilder = new StudentConcreteBuilder().setFirstName("Tran").setLastName("Quang Huy");
		System.out.println(studentBuilder.build());
	}
}
