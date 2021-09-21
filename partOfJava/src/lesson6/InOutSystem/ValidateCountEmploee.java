package lesson6.InOutSystem;

public class ValidateCountEmploee {
	public static void validate(int nowCountEmpl, int maxCountEmployee) throws CountEmployeeException {
		if (nowCountEmpl > maxCountEmployee) {
			throw new CountEmployeeException("Regisration not successful. The amount of employees is exceeded. Maximum amount: " + maxCountEmployee + "  You wanted to register: " + nowCountEmpl);
		}
	}
}

