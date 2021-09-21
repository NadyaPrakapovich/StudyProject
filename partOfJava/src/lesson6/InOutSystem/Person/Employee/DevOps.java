package lesson6.InOutSystem.Person.Employee;

import lesson6.InOutSystem.Person.Employee.Office.VIPRoom;

public class DevOps extends Employee implements VIPRoom {

	public DevOps(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheRoom() {
		System.out.println("DevOps can come in...");
	}
}
