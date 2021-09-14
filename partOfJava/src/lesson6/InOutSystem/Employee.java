package lesson6.InOutSystem;

public abstract class Employee extends Person {

    private static int countEmpl;
    private static int count = 1; // TODO: 9/1/2021 Does we can save count of users in this class? [Pavel.Chachotkin]
    protected IdCard idCard;
    protected Status status;

    public Employee(String name, String lastName) {
        super(name, lastName);
        this.status = Status.OUT_OFFICE;
        countEmpl = count++;
    }

    public static int getCountEmployee() {
        return countEmpl;
    }

    public void generationIdCard() {
        idCard = IdCard.createIdCard();
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public Status getStatus() {
        return status;
    }

}


