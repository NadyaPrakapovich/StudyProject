package lesson6.InOutSystem;

public class Journal {
    private int generalCountEmployee;
    private Employee[] journal;
    private static int index = 0;

    public Journal(int contEmpl) {
        this.generalCountEmployee = contEmpl;
        this.journal = new Employee[generalCountEmployee];
    }

    public static int getIndex() {
        return index=0;
    }

    public void registration(Employee... employee) {
        int nowCountEmpl = Employee.getCountEmployee();
        //   index = getIndex() + 1; // TODO: 9/1/2021 For what here used method getIndex()? [Pavel.Chachotkin]
        try {
            for (int i = 0; i < employee.length; i++) {

                ValidateCountEmploee.validate(nowCountEmpl, generalCountEmployee);
                journal[index] = employee[i];
                journal[index].idCard = new IdCard().createIdCard();
                index++;
            }
            } catch (Exception e) {
                e.printStackTrace(); // TODO: 9/1/2021 Convert exception to user friendly message [Pavel.Chachotkin]
            }

    }

    public void printAllEmployee() {
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                System.out.print(journal[i].name + ", ");
                System.out.print(journal[i].lastName + ", ");
                System.out.print(journal[i].idCard + ", ");
                System.out.println(journal[i].status);
            }
        }
    }

    public Employee findIdCardInSystem(String idCard) {
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null && journal[i].idCard.equals(idCard)) {
                return journal[i];
            }
        }
        return null;
    }

    public void findEmployeeByName(String name, String lastName) {
        for (int i = 0; i < journal.length; i++) {
            if ((journal[i] != null) && (journal[i].name == name) && (journal[i].lastName == lastName)) {
                journal[i].status = Status.IN_OFFICE_WITHOUT_CARD;
            }
        }
    }

    public void chekIdCard(Employee empl) {
        Employee employee = findIdCardInSystem(empl.idCard);
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                if (employee != null) {
                    if (journal[i].idCard.equals(empl.idCard)) {
                        if (journal[i].name == employee.name && journal[i].lastName == employee.lastName) {
                            journal[i].status = Status.IN_OFFICE;
                        }
                    }
                } else findEmployeeByName(empl.name, empl.lastName);
            }
        }
    }
}