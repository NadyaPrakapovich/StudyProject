package lesson6.InOutSystem.Person.employee.manager;

import lesson6.InOutSystem.Person.office.VIPRoom;

public class Director extends Manager implements VIPRoom {
	public Director(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheVipRoom() {
		System.out.println("Director can come in ...");
	}
}
