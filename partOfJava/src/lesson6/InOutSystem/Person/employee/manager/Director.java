package lesson6.InOutSystem.Person.employee.manager;

import lesson6.InOutSystem.Person.office.VIPRoom;

import java.io.Serializable;

public class Director extends Manager implements VIPRoom, Serializable {

	public Director(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public void enterTheVipRoom() {
		System.out.println("Director can come in ...");
	}
}
