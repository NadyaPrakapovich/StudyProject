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
        return index;
    }

    // TODO: 9/14/2021 What will be if I'll call this method without arguments [Pavel.Chachotkin]
    public void registration(Employee... employee) {
        int nowCountEmpl = Employee.getCountEmployee();
        try {
            for (int i = 0; i < employee.length; i++) {

                ValidateCountEmploee.validate(nowCountEmpl, generalCountEmployee);
                journal[index] = employee[i];
                journal[index].generationIdCard();
                index++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void printAllEmployee() {
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                System.out.print(journal[i].name + ", ");
                System.out.print(journal[i].lastName + ", ");
                System.out.print(journal[i].idCard.getIdCard() + ", ");
                System.out.println(journal[i].status);
            }
        }
    }

    public Employee findIdCardInSystem(String idCard) {
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null && journal[i].idCard != null && journal[i].idCard.getIdCard().equals(idCard)) {
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
        if (empl.idCard != null) {
            Employee employee = findIdCardInSystem(empl.idCard.getIdCard());
            for (int i = 0; i < journal.length; i++) {
                if (journal[i] != null) {
                    if (employee != null) {
                        if (journal[i].idCard.getIdCard().equals(empl.idCard.getIdCard())) {
                            if (journal[i].name == employee.name && journal[i].lastName == employee.lastName) {
                                journal[i].status = Status.IN_OFFICE;
                            }
                        }
                    } else findEmployeeByName(empl.name, empl.lastName);
                }
            }
        }
    }
}

