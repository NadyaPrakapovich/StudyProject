package lesson6.InOutSystem;
import lesson6.InOutSystem.Manager;
import lesson6.InOutSystem.VIPRoom;

public class DeputyOfDirector extends Manager implements VIPRoom {

	public DeputyOfDirector(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheRoom() {
		System.out.println("Deputy of director can come in ...");
	}
}
