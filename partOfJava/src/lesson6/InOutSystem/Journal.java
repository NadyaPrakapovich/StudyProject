package lesson6.InOutSystem;

public class Journal {
	private final int generalCountEmployee = 15;
	private final Employee[] journal = new Employee[generalCountEmployee];


	public void registration(Employee employee) {
		int nowCountEmpl = Employee.getCountEmployee();
		try {
			ValidateCountEmploee.validate(nowCountEmpl, generalCountEmployee);
			journal[nowCountEmpl] = employee;
			journal[nowCountEmpl].idCard = new IdCard().createIdCard();
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getAllEmployee() {
		for (int i = 0; i < journal.length; i++) {
			if (journal[i] != null) {
				System.out.println(journal[i].name);
				System.out.println(journal[i].lastName);
				System.out.println(journal[i].idCard);
				System.out.println(journal[i].status);
			}
		}
	}

	public Employee findIdCardInSystem(String idCard) {
		for (int i = 0; i < journal.length; i++) {
			if (journal[i] != null && journal[i].idCard.equals(idCard)) {
				return journal[i];
				//	System.out.println(journal[i].name);
			}
		}
		return null;
	}

	public void chekIdCard(String idCard) {
		Employee employee = findIdCardInSystem(idCard);
		for (int i = 0; i < journal.length; i++) {
			if (employee != null) {
				if (journal[i] != null) {
					if (journal[i].idCard.equals(idCard)) {
						if (journal[i].name == employee.name && journal[i].lastName == employee.lastName) {
							journal[i].status = Status.IN_OFFICE;
						}
					} else if ((journal[i].name == employee.name) && (journal[i].lastName == employee.lastName)) {
						journal[i].status = Status.IN_OFFICE_WITHOUT_CARD;
					}
				}

			}
			//else
			//	journal[i].status = Status.OUT_OFFICE;
		}

	}
}
//		public void findInSystem (Employee employee){
//
//			for (int i = 0; i < journal.length; i++) {
//				if (journal[i] != null) {
//					if ((journal[i].idCard == employee.idCard) && (journal[i].name == employee.name) && (journal[i].lastName == employee.lastName)) {
//
//						journal[i].status = Status.IN_OFFICE;
//					} else if ((journal[i].name == employee.name) && (journal[i].lastName == employee.lastName)) {
//						journal[i].status = Status.IN_OFFICE_WITHOUT_CARD;
//					} else {
//						System.out.println("Not find this employee");
//					}
//				}
//			}
//			//	System.out.println(jurnal[0].status);
//		}
//
//
//	}
//

//	}