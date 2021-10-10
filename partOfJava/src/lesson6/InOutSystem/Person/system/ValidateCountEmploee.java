package lesson6.InOutSystem.Person.system;

public class ValidateCountEmploee {
	public static void validate(int nowCountEmpl, int additionCountEmpl, int maxCountEmployee) throws CountEmployeeException {
		int currentCountEmpl=nowCountEmpl+additionCountEmpl;
		if ( currentCountEmpl> maxCountEmployee) {
			throw new CountEmployeeException("Regisration not successfull. The amount of employees is exceeded. Maximum amount: " + maxCountEmployee + "  You wanted to register: " + currentCountEmpl);
		}
	}
}

