package Lesson13.Play;

public class PlayingField {
    final int allCountCard = 10;
    int nowCountCard = 0;

    public synchronized int put() {
        if (nowCountCard <= allCountCard) {
            while (nowCountCard > 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            nowCountCard++;
            System.out.println("player put 1 card ");
            System.out.println("player has " + (allCountCard - nowCountCard));
            return 1;
            }
            return 0;
        }


    public synchronized void get() {
        while (nowCountCard < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        //if (nowCountCard > 0) {
        nowCountCard--;
        System.out.println("Leader get card " + nowCountCard);
        System.out.println("Lost card" + (allCountCard - nowCountCard));
        notify();
        //return 1;
    }
    //	return 0;

}