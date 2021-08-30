package lesson6.InOutSystem;

public class ValidateCountEmploee {
    public static void validate(int nowCountEmpl, int generalCount) throws Exception {
        if (nowCountEmpl > generalCount) {
            throw new ArrayIndexOutOfBoundsException("Regisration not successful. The amount of employees is exceeded. Maximum amount: " + generalCount + "  You wanted registration: " + nowCountEmpl);
        }
    }
}

