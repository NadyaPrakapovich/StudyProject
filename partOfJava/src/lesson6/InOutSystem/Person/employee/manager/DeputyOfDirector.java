package lesson6.InOutSystem.Person.employee.manager;

import lesson6.InOutSystem.Person.office.VIPRoom;

import java.io.Serializable;

public class DeputyOfDirector extends Manager implements VIPRoom, Serializable {

	public DeputyOfDirector(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheVipRoom() {
		System.out.println("Deputy of director can come in ...");
	}
}
