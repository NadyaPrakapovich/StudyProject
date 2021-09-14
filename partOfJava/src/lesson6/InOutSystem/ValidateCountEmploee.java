package lesson6.InOutSystem;

public class ValidateCountEmploee {
    public static void validate(int nowCountEmpl, int generalCount) {
        if (nowCountEmpl > generalCount) {
            // TODO: 9/14/2021 Where is your custom exception? [Pavel.Chachotkin]
            throw new ArrayIndexOutOfBoundsException("Regisration not successful. The amount of employees is exceeded. Maximum amount: " + generalCount + "  You wanted to register: " + nowCountEmpl);
        }
    }
}

