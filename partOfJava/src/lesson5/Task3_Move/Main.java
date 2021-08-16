package lesson5.Task3_Move;

public class Main {
    public static void main(String[] args) {
        Cars cars= new Cars();
        Cars.ExampleMove exampleMove=cars.new ExampleMove();
        exampleMove.movement();

        Bicycle bicycle=new Bicycle();
        Bicycle.ExampleMove exampleMove1=bicycle.new ExampleMove();
        exampleMove1.movement();

        Snail snail=new Snail();
        Snail.ExampleMove exampleMove2=snail.new ExampleMove();
        exampleMove2.movement();

    }
}
