package lesson6.InOutSystem;

public class DevOps extends Employee implements Room123 {

	public DevOps(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void enterTheRoom() {
		System.out.println("DevOps can come in...");
	}
}
