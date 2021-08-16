package lesson5.Task2_Chair;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("black", true);
        Chair.legs legs = chair.new legs("wood");
        Chair.back back = chair.new back();
        Chair.seat seat=chair.new seat();

        back.moveBack();
        back.moveForward();
    }
}
