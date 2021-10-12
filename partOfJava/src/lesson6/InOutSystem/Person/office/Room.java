package lesson6.InOutSystem.Person.office;

import lesson6.InOutSystem.Person.employee.Employee;

import java.util.ArrayList;


public class Room<T extends Employee> {
	ArrayList<T> listEmployeesInTheRoom = new ArrayList<>();

	public Room() {

	}

	public void enterTheRoom(Employee employee) {
		listEmployeesInTheRoom.add((T) employee);
	}

	public ArrayList<T> getListEmployeeInTheRoom() {
		return listEmployeesInTheRoom;
	}

}
