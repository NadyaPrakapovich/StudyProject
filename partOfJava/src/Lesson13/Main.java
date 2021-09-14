package Lesson13;

import Lesson13.Play.Leading;
import Lesson13.Play.Player;
import Lesson13.Play.PlayingField;

public class Main {
    public static void main(String[] args) {
        PlayingField playingField = new PlayingField();
  //         for (int i = 0; i < 2; i++) {
        Thread thread = new Thread(new Player(playingField));
        thread.setName("player ");
        thread.start();
  //            	}

        Thread thread2 = new Thread(new Leading(playingField));
        thread2.setName("Leading ");
        thread2.start();
    }
}
