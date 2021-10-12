package lesson6.InOutSystem.Person.employee;

import lesson6.InOutSystem.Person.system.IdCard;
import lesson6.InOutSystem.Person.system.Status;
import lesson6.InOutSystem.Person.Person;

import java.io.Serializable;

public abstract class Employee extends Person implements Serializable {

	protected IdCard idCard;
	protected Status status;

	public Employee(String name, String lastName) {
		super(name, lastName);
		this.status = Status.OUT_OFFICE;
	}

	protected Employee() {
	}

	public void generationIdCard() {
		idCard = IdCard.createIdCard();
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;

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


