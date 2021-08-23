package lesson6.InOutSystem;

import java.util.UUID;

public abstract class Employee extends Person {

	protected  String idCard;
	protected Status status;

	private int countEmpl;
	private static int count = 1;
	Employee[] jurnal = new Employee[15];

	public Employee(String name, String surname) {
		super(name, surname);
		countEmpl = count++;
	}

	public String getIdCard() {
		return idCard;
	}

	public Status getStatus() {
		return status;
	}

	public String getNewId() {
		idCard = UUID.randomUUID().toString();
		return idCard;
	}

	public void register(Employee employee) {
		jurnal[countEmpl] = employee;
		jurnal[countEmpl].idCard = getNewId();
	}

	public void printEmployee() {
		//for (int i = 1; i <=countEmpl; i++) {
		System.out.println(jurnal[countEmpl].name);
		System.out.println(jurnal[countEmpl].surname);
		System.out.println(jurnal[countEmpl].idCard);
		System.out.println(jurnal[countEmpl].status);
		//}
	}

	// тут что-то не работает
//	public void findInSystem(String name, String surname, String idCard) {
//		for (int i = 0; i < jurnal.length ; i++) {
//			if ((jurnal[i].idCard == idCard) && (jurnal[i].name == name) && (jurnal[i].surname == surname)) {
//
//				jurnal[i].status = Status.IN_OFFICE;
//			}
//			else if ((jurnal[i].name == name) && (jurnal[i].surname == surname)) {
//				jurnal[i].status = Status.IN_OFFICE_WITHOUT_CARD;
//			} else {
//				//jurnal[i].status = Status.OUT_OFFICE;
//				System.out.println("Not find this employee");
//			}
//		}
//		System.out.println(jurnal[0].status);
//	}


}
