package lesson6;

import lesson6.InOutSystem.Person.Journal;
import lesson6.InOutSystem.Person.Employee.Employee;
import lesson6.InOutSystem.Person.Employee.ITDеpartment;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Journal journal = new Journal(4);

		ITDеpartment itDepartment = new ITDеpartment("VasyaIt1", "Ivanov1");
		//journal.registration(itDepartment);

		ArrayList<Employee> itDеpartments = new ArrayList<>();
		itDеpartments.add(new ITDеpartment("VasyaIt2", "Ivanov2"));
		itDеpartments.add(new ITDеpartment("VasyaIt3", "Ivanov3"));
		itDеpartments.add(new ITDеpartment("VasyaIt4", "Ivanov4"));
		itDеpartments.add(new ITDеpartment("VasyaIt5", "Ivanov5"));
		journal.registration(itDepartment);
		journal.registration(itDеpartments);


		journal.printAllEmployeee();
	//	journal.registration(itDеpartments);

//        ITDеpartment itDepartment1 = new ITDеpartment("VasyaIt1", "Ivanov1");
//        ITDеpartment itDepartment2 = new ITDеpartment("VasyaIt2", "Ivanov2");
//        journal.registration(itDepartment, itDepartment1, itDepartment2);
//
//        journal.chekIdCard(itDepartment);
//
//        journal.chekIdCard(itDepartment2);
//
//       // journal.chekIdCard();
//
//        DevOps devOps = new DevOps("FedyaDev", "Sidorov");
//        DevOps devOps1 = new DevOps("FedyaDev1", "Sidorov1");
//        journal.registration(devOps, devOps1);
//
//        Director director = new Director("IvanDir", "Petrov");
//        Director director1 = new Director("IvanDir1", "Petrov1");
//        Director director2 = new Director("IvanDir2", "Petrov2");
//        Director director3 = new Director("IvanDir3", "Petrov3");
//
//        journal.registration(director, director1, director2, director3);
//
//        Director director5 = new Director("ffff", "fff");
//        journal.registration(director5);
//        journal.chekIdCard(director5);
//        journal.printAllEmployee();
//
//        Room<ITDеpartment> room = new Room<>(itDepartment2);
//        room.enterTheRoom();
//        Room<Director> room1 = new Room<>(director5);
//        room1.enterTheRoom();
//        Room<DevOps> room3 = new Room<>(devOps);
//        room1.enterTheRoom();
//        System.out.println(room.getCountEmployeeTheRoom());
	}
}
