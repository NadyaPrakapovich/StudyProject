package lesson6.InOutSystem;

public class Director extends Employee implements Room123 {
	public Director(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void openDoor() {
		System.out.println("Director can come in ...");
	}
}
