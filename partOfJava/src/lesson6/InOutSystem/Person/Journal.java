package lesson6.InOutSystem.Person;

import lesson6.InOutSystem.Person.Employee.CountEmployeeException;
import lesson6.InOutSystem.Person.Employee.Employee;
import lesson6.InOutSystem.Person.Employee.ValidateCountEmploee;

import java.util.ArrayList;

import static lesson6.InOutSystem.Person.Employee.Status.*;

public class Journal {
	private int maxCountEmployee;
	private ArrayList<Employee> employeeList = new ArrayList<>();
	private int currentCountEmployee = 0;

	public Journal(int maxCountEmployee) {
		this.maxCountEmployee = maxCountEmployee;
	}

	public void registration(Employee employee) {
		//проверить есть ли и проверить maxcount
		if ((findEmployeeByNameInSystem(employee)) == true) {
			System.out.println("This employee already is in system" + employee.lastName + " " + employee.name);
		} else {
			try {

				ValidateCountEmploee.validate(currentCountEmployee + 1, maxCountEmployee);
				employeeList.add(employee);
				//employeeList.get(currentCountEmployee).status = IN_OFFICE;
				employeeList.get(currentCountEmployee).generationIdCard();
				currentCountEmployee++;
			} catch (CountEmployeeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void registration(ArrayList<Employee> employees) {
		for (int i = 0; i < employees.size(); i++) {
			if ((findEmployeeByNameInSystem(employees.get(i))) == true) {
				System.out.println("This employee already is in system" + employees.get(i).name + " " + employees.get(i).lastName);
			} else {
				try {

					ValidateCountEmploee.validate(currentCountEmployee + 1, maxCountEmployee);
					employeeList.add(employees.get(i));
					//employeeList.get(currentCountEmployee).status = IN_OFFICE;
					employeeList.get(currentCountEmployee).generationIdCard();
					currentCountEmployee++;
				} catch (CountEmployeeException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}


	public void printAllEmployeee() {
		for (Employee employee : employeeList) {
			System.out.print(employee.name + " ");
			System.out.print(employee.lastName + " ");
			//System.out.print(employee.idCard.getIdCard() + " ");
			//System.out.println(employee.status);
		}
	}

	public boolean findEmployeeByNameInSystem(Employee employee) {
		boolean res = employeeList.equals(employee);
		return res;
	}


// This implementation was using arrays
//	public void registration(Employee... employee) {
//		int nowCountEmpl = Employee.getCountEmployee();
//		try {
//			for (int i = 0; i < employee.length; i++) {
//
//				ValidateCountEmploee.validate(nowCountEmpl, generalCountEmployee);
//				journal[index] = employee[i];
//				journal[index].generationIdCard();
//				index++;
//			}
//		} catch (CountEmployeeException e) {
//			System.out.println(e.getMessage());
//		}
//	}


//	public void printAllEmployee() {
//		for (int i = 0; i < journal.length; i++) {
//			if (journal[i] != null) {
//				System.out.print(journal[i].name + ", ");
//				System.out.print(journal[i].lastName + ", ");
//				System.out.print(journal[i].idCard.getIdCard() + ", ");
//				System.out.println(journal[i].status);
//			}
//		}
//	}

//	public Employee findIdCardInSystem(String idCard) {
//		for (int i = 0; i < journal.length; i++) {
//			if (journal[i] != null && journal[i].idCard != null && journal[i].idCard.getIdCard().equals(idCard)) {
//				return journal[i];
//			}
//		}
//		return null;
//	}
//
//	public void findEmployeeByName(String name, String lastName) {
//		for (int i = 0; i < journal.length; i++) {
//			if ((journal[i] != null) && (journal[i].name == name) && (journal[i].lastName == lastName)) {
//				journal[i].status = Status.IN_OFFICE_WITHOUT_CARD;
//			}
//		}
//	}
//
//	public void chekIdCard(Employee empl) {
//		if (empl.idCard != null) {
//			Employee employee = findIdCardInSystem(empl.idCard.getIdCard());
//			for (int i = 0; i < journal.length; i++) {
//				if (journal[i] != null) {
//					if (employee != null) {
//						boolean isIdCardsEquals = journal[i].idCard.getIdCard().equals(empl.idCard.getIdCard());
//						if (isIdCardsEquals) {
//							if (journal[i].name == employee.name && journal[i].lastName == employee.lastName) {
//								journal[i].status = Status.IN_OFFICE;
//							}
//						}
//					} else findEmployeeByName(empl.name, empl.lastName);
//				}
//			}
//		}
//	}
}

