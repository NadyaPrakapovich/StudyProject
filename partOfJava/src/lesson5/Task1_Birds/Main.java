package lesson5.Task1_Birds;

public class Main {
    public static void main(String[] args) {

        Birds birds1=new Birds("Ястреб", 3.2);
        Birds birds2=new Birds("Воробей", 0.4);
        Birds birds3=new Birds("Пингвин");

        birds2.setWight(0.6);
        System.out.println(birds1.getWeight());
        System.out.println(birds3.getKind());

        Birds.SumWeght(birds1.weight);
        Birds.SumWeght(birds2.weight);
        Birds.SumWeght(birds3.weight);

    }
}