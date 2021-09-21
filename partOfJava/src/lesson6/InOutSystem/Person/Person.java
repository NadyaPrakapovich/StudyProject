package lesson6.InOutSystem.Person;

public abstract class Person {
	protected String name;
	protected String lastName;


	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
}
