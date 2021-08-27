package lesson6.InOutSystem;

import java.util.Random;

public class IdCard {
    private int number;

    public int createId(){
        Random rnd=new Random();
        number=rnd.nextInt();
        System.out.println(number);
        return number;
    }
}
