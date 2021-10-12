package lesson6.InOutSystem.Person.employee.manager;

import lesson6.InOutSystem.Person.employee.Employee;

import java.io.Serializable;

public abstract class Manager extends Employee implements Serializable {


	public Manager(String name, String lastName) {
		super(name, lastName);
	}

	protected Manager() {
	}
}
