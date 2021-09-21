package lesson6.InOutSystem.Person.Employee;

import lesson6.InOutSystem.Person.Person;

public abstract class Employee extends Person {

	protected IdCard idCard;
	protected Status status;

	public Employee(String name, String lastName) {
		super(name, lastName);
		this.status = Status.OUT_OFFICE;
	}

	public void generationIdCard() {
		idCard = IdCard.createIdCard();
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public boolean equals(Object o) {
		Employee o1 = (Employee) o;
		if (this.name.equals(o1.name) && (this.lastName.equals(o1.lastName))) {
			return true;
		}
		return false;


	}

}


