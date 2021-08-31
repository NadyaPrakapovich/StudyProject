package lesson6.InOutSystem;

public class Room<T> {
    T employee;
    private static int countEmployeeTheRoom;
    private static int count = 1;

    public Room(T employee) {
        this.employee = employee;
        countEmployeeTheRoom = count++;
    }

    public int getcountEmployeeTheRoom() {
        return countEmployeeTheRoom;
    }

    public void enterTheRoom() {
        System.out.println("Employee is the room ...");
    }
}
