package lesson6.InOutSystem;

public class Director extends Employee implements VIPRoom {
	public Director(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheRoom() {
		System.out.println("Director can come in ...");
	}
}
