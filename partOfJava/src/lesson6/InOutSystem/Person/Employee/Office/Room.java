package lesson6.InOutSystem.Person.Employee.Office;

import lesson6.InOutSystem.Person.Employee.Employee;

public class Room<T extends Employee> {
    T[] employees;
    private static int countEmployeeTheRoom;

      public Room(T[] employees) {
        this.employees = employees;
        countEmployeeTheRoom++;
    }

    public int getCountEmployeeTheRoom() {
        return countEmployeeTheRoom;
    }

    public void enterTheRoom() {


        System.out.println("Employee is the room ...");
    }
}