package lesson6.InOutSystem;

public abstract class Person {
	protected String name;
	protected String lastName;


	public Person(String name, String surname) {
		this.name = name;
		this.lastName = surname;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
}
