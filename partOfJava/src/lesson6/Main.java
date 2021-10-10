package lesson6;

import lesson6.InOutSystem.Person.employee.DevOps;
import lesson6.InOutSystem.Person.Journal;
import lesson6.InOutSystem.Person.employee.Employee;
import lesson6.InOutSystem.Person.employee.ITDеpartment;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Journal journal = new Journal(12);

		ITDеpartment itDepartment = new ITDеpartment("VasyaIt1", "Ivanov1");
		journal.registration(itDepartment);
		journal.enterTheOffice(itDepartment);

		ArrayList<Employee> itDеpartments = new ArrayList<>();
		itDеpartments.add(new ITDеpartment("VasyaIt2", "Ivanov2"));
		itDеpartments.add(new ITDеpartment("VasyaIt3", "Ivanov3"));
		itDеpartments.add(new ITDеpartment("VasyaIt4", "Ivanov3"));
		itDеpartments.add(new ITDеpartment("VasyaIt5", "Ivanov5"));
		itDеpartments.add(new ITDеpartment("VasyaIt6", "Ivanov6"));
		itDеpartments.add(new ITDеpartment("VasyaIt6", "Ivanov6"));
		itDеpartments.add(new ITDеpartment("VasyaIt8", "Ivanov8"));

		journal.registration(itDеpartments);

        DevOps devOps = new DevOps("FedyaDev", "Sidorov");
        journal.registration(devOps);
        journal.enterTheOffice(devOps);

		journal.printAllEmployeee();


//        Room<ITDеpartment> room = new Room<>(itDepartment2);
//        room.enterTheRoom();
//        Room<Director> room1 = new Room<>(director5);
//        room1.enterTheRoom();
//        Room<DevOps> room3 = new Room<>(devOps);
//        room1.enterTheRoom();
//        System.out.println(room.getCountEmployeeTheRoom());
	}
}
