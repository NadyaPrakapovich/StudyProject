package lesson6.InOutSystem.Person;

import lesson6.InOutSystem.Person.system.CountEmployeeException;
import lesson6.InOutSystem.Person.employee.Employee;
import lesson6.InOutSystem.Person.system.ValidateCountEmploee;
import lesson6.InOutSystem.Person.system.Status;

import java.util.ArrayList;

public class Journal {
	private int maxCountEmployee;
	private ArrayList<Employee> journalEmployeeList = new ArrayList<>();
	private int currentCountEmployee = 0;

	public Journal(int maxCountEmployee) {
		this.maxCountEmployee = maxCountEmployee;
	}

	public void registration(Employee employee) {
		if (!journalEmployeeList.contains(employee)) {
			try {
				ValidateCountEmploee.validate(currentCountEmployee, 1, maxCountEmployee);
				journalEmployeeList.add(employee);
				journalEmployeeList.get(currentCountEmployee).setStatus(Status.OUT_OFFICE);
				journalEmployeeList.get(currentCountEmployee).generationIdCard();
				currentCountEmployee++;
			} catch (CountEmployeeException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("This employee " + employee.lastName + " " + employee.name + " already is in system");
		}
	}

	public void registration(ArrayList<Employee> employees) {
		try {
			ValidateCountEmploee.validate(journalEmployeeList.size(), employees.size(), maxCountEmployee);
			for (Employee employee : employees) {
				registration(employee);
			}
		} catch (CountEmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

	public void enterTheOffice(Employee employee) {
		if (employee.getIdCard() != null) {
			for (Employee empl : journalEmployeeList) {

				if ((empl.getIdCard().getIdCard().equals(employee.getIdCard().getIdCard()))
						&& (empl.lastName.equals(employee.lastName)) && (empl.name.equals(employee.name))) {
					empl.setStatus(Status.IN_OFFICE);
				} else if ((empl.lastName.equals(employee.lastName)) && (empl.name.equals(employee.name))) {
					empl.setStatus(Status.IN_OFFICE_WITHOUT_CARD);
				}
			}
		} else {
			System.out.println("This employee " + employee.lastName + " " + employee.name + " not registered in system");
		}
	}

	public void leaveTheOffice(Employee employee) {
		for (Employee empl : journalEmployeeList) {
			if (empl.getIdCard().getIdCard().equals(employee.getIdCard().getIdCard())) {
				empl.setStatus(Status.OUT_OFFICE);
			}
		}
	}

	public void printAllEmployeee() {
		System.out.println("Journal all employees:");
		for (Employee employee : journalEmployeeList) {
			System.out.print(employee.name + " ");
			System.out.print(employee.lastName + " ");
			System.out.print(employee.getIdCard().getIdCard().toString() + " ");
			System.out.println(employee.getStatus() + " ");
		}
	}
}

