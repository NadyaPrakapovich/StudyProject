package lesson6.InOutSystem;

public abstract class Employee extends Person {

	private static int countEmpl;
	private static int count = 1; // TODO: 9/1/2021 Does we can save count of users in this class? [Pavel.Chachotkin]
	protected String idCard; // TODO: 9/1/2021 IdCard must be realized as class [Pavel.Chachotkin]
	protected Status status;

	// TODO: 9/1/2021 Which status I will catch after creating user? [Pavel.Chachotkin]
	public Employee(String name, String lastName) {
		super(name, lastName);
		countEmpl = count++;
	}

	public static int getCountEmployee() {
		return countEmpl;
	}

	public String getIdCard() {
		return idCard;
	}

	public Status getStatus() {
		return status;
	}

// TODO: 9/1/2021 Must not be commented code in project without reason in comment [Pavel.Chachotkin]
//	public void enterTheOffice(Employee employee) {
//		//boolean res=new Journal().findIdCardInSystem(employee.idCard);
//		Journal journal = new Journal();
//		journal.findIdCardInSystem(employee.idCard);
//
//
//		//System.out.println(res);
//	}
}


