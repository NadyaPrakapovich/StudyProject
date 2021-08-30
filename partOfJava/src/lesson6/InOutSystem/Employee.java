package lesson6.InOutSystem;

public abstract class Employee extends Person {

	private static int countEmpl;
	protected String idCard;
	protected Status status;

	private static int count = 1;

	public Employee(String name, String lastName
	) {
		super(name, lastName);
		countEmpl = count++;
			}





	public String getIdCard() {
		return idCard;
	}

	public Status getStatus() {
		return status;
	}

	public static int getCountEmployee() {
		return countEmpl;
	}


//	public void enterTheOffice(Employee employee) {
//		//boolean res=new Journal().findIdCardInSystem(employee.idCard);
//		Journal journal = new Journal();
//		journal.findIdCardInSystem(employee.idCard);
//
//
//		//System.out.println(res);
//	}
}


