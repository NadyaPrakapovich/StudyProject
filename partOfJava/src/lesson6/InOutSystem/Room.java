package lesson6.InOutSystem;

// TODO: 9/1/2021 With this realization I can create a room with String type.
// Must be limited by Employees class [Pavel.Chachotkin]
public class Room<T> {
    T employee; // TODO: 9/1/2021 With this realization I can create cabinet onl for one person [Pavel.Chachotkin]
    private static int countEmployeeTheRoom;
    private static int count = 1; // TODO: 9/1/2021 If I get count before adding employees which count I'll catch? [Pavel.Chachotkin]

    public Room(T employee) {
        this.employee = employee;
        countEmployeeTheRoom = count++;
    }

    // TODO: 9/1/2021 Fix method name by camelCase [Pavel.Chachotkin]
    public int getCountEmployeeTheRoom() {
        return countEmployeeTheRoom;
    }

    public void enterTheRoom() {
        System.out.println("Employee is the room ...");
    }
}
