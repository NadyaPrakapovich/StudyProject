package lesson6;

import lesson6.InOutSystem.Person.employee.DevOps;
import lesson6.InOutSystem.Person.Journal;
import lesson6.InOutSystem.Person.employee.Employee;
import lesson6.InOutSystem.Person.employee.ITDеpartment;
import lesson6.InOutSystem.Person.employee.manager.Director;
import lesson6.InOutSystem.Person.employee.manager.Teamlead;
import lesson6.InOutSystem.Person.office.Room;

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
		journal.enterTheOffice(itDеpartments.get(2));

		ArrayList<Employee> devOpses = new ArrayList<>();
		devOpses.add(new DevOps("Fedya1", "Sidorov"));
		devOpses.add(new DevOps("Fedya2", "Sidorov"));
		journal.registration(devOpses);
		journal.enterTheOffice(devOpses.get(0));

		journal.printAllEmployeee();
		System.out.println();

		//journal.leaveTheOffice(itDepartment);
		journal.printAllEmployeee();

		System.out.println();
		System.out.println("New journal");
		Journal journal1 = new Journal(5);
		Teamlead teamlead = new Teamlead("Sonya", "Petrova");
		journal1.registration(teamlead);
		journal1.enterTheOffice(teamlead);
		//journal1.leaveTheOffice(teamlead);
		journal1.printAllEmployeee();


		System.out.println();
		Room<Employee> room = new Room<>();
		room.enterTheRoom(itDepartment);
		room.enterTheRoom(teamlead);
		ArrayList<Employee> employeeInTheRoom = room.getListEmployeeInTheRoom();
		System.out.println("This employee is the room");
		for (Employee emp : employeeInTheRoom) {
			System.out.print(emp.getName() + " ");
			System.out.println(emp.getLastName());
		}

	}
}
