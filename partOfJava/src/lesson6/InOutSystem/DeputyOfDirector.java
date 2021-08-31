package lesson6.InOutSystem;

public class DeputyOfDirector extends Employee implements VIPRoom {

	public DeputyOfDirector(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheRoom() {
		System.out.println("Deputy of director can come in ...");
	}
}
