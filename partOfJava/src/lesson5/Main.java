package lesson5;

import lesson5.Task1_Birds.Birds;
import lesson5.Task2_Chair.Chair;
import lesson5.Task3_Move.Bicycle;
import lesson5.Task3_Move.Cars;
import lesson5.Task3_Move.Snail;

public class Main {
	public static void main(String[] args) {

		Birds birds1 = new Birds("Ястреб", 3.2);
		Birds birds2 = new Birds("Воробей", 0.4);
		Birds birds3 = new Birds("Пингвин");

		birds2.setWight(0.6);
		System.out.println(birds1.getWeight());
		System.out.println(birds3.getKind());

		Birds.sumWeight(birds1.weight);
		Birds.sumWeight(birds2.weight);
		Birds.sumWeight(birds3.weight);

		Chair chair = new Chair("black", true);
		Chair.legs legs = chair.new legs("wood");
		Chair.back back = chair.new back();
		Chair.seat seat = chair.new seat();

		back.moveBack();
		back.moveForward();

		Cars.ExampleMove exampleMove1 = new Cars.ExampleMove();
		exampleMove1.printMovement();

		Bicycle.ExampleMove exampleMove = new Bicycle.ExampleMove();
		exampleMove.printMovement();

		Snail.ExampleMove exampleMove2 = new Snail.ExampleMove();
		exampleMove2.printMovement();

	}
}