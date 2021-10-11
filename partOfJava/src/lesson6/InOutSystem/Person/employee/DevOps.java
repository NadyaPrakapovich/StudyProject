package lesson6.InOutSystem.Person.employee;

import lesson6.InOutSystem.Person.office.VIPRoom;

public class DevOps extends Employee implements VIPRoom {

	public DevOps(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheVipRoom() {
		System.out.println("DevOps can come in...");
	}
}
