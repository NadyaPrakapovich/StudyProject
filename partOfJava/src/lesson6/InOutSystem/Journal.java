package lesson6.InOutSystem;

public class Journal {
	private final int generalCountEmployee = 15;
	private final Employee[] journal = new Employee[generalCountEmployee];


	public void registration(Employee employee) {
		int nowCountEmpl = Employee.getCountEmployee();
		if (nowCountEmpl <= generalCountEmployee) {
			journal[nowCountEmpl] = employee;
			journal[nowCountEmpl].idCard = new IdCard().createIdCard();
		}
	}
}