package lesson6.InOutSystem;

public class DeputyOfDirector extends Employee implements Room123 {

	public DeputyOfDirector(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void enterTheRoom() {
		System.out.println("Deputy of director can come in ...");
	}
}
