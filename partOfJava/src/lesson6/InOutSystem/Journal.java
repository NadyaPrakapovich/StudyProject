package lesson6.InOutSystem;

public class Journal {
    private final int generalCountEmployee = 15;
    private final Employee[] journal = new Employee[generalCountEmployee];
    private static int index;

    public static int getIndex() {
        return index;
    }

    public void registration(Employee... employee) {
        int nowCountEmpl = Employee.getCountEmployee();
         index = getIndex()+1; // TODO: 9/1/2021 For what here used method getIndex()? [Pavel.Chachotkin]
        for (int i = 0; i < employee.length; i++) {
            try {
                ValidateCountEmploee.validate(nowCountEmpl, generalCountEmployee);
                journal[index] = employee[i];
                journal[index].idCard = new IdCard().createIdCard();
            } catch (Exception e) {
                e.printStackTrace(); // TODO: 9/1/2021 Convert exception to user friendly message [Pavel.Chachotkin]

            }
            index++;
        }

    }

    // TODO: 9/1/2021 If method has 'get' prefix it must be return something [Pavel.Chachotkin]
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

    public void chekIdCard(String idCard) {
        Employee employee = findIdCardInSystem(idCard);
        for (int i = 0; i < journal.length; i++) {
            if (employee != null) {
                if (journal[i] != null) {
                    if (journal[i].idCard.equals(idCard)) {
                        if (journal[i].name == employee.name && journal[i].lastName == employee.lastName) {
                            journal[i].status = Status.IN_OFFICE;
                        }
                    } else if ((journal[i].name == employee.name) && (journal[i].lastName == employee.lastName)) {
                        journal[i].status = Status.IN_OFFICE_WITHOUT_CARD;
                    }
                }

            }
        }
    }
}