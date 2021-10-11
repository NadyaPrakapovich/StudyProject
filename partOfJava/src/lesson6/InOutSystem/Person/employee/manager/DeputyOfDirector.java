package lesson6.InOutSystem.Person.employee.manager;

import lesson6.InOutSystem.Person.office.VIPRoom;

public class DeputyOfDirector extends Manager implements VIPRoom {

	public DeputyOfDirector(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheVipRoom() {
		System.out.println("Deputy of director can come in ...");
	}
}
