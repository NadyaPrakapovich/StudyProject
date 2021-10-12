package lesson6.InOutSystem.Person.employee.manager;

import java.io.Serializable;

public class Accountant extends Manager implements Serializable {

	public Accountant(String name, String lastName) {
		super(name, lastName);
	}
}
