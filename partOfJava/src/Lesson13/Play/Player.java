package Lesson13.Play;

import static java.lang.Thread.*;

public class Player implements Runnable {
	PlayingField playingField;
	int countCard = 0;

	public Player(PlayingField playingField) {
		this.playingField = playingField;
	}


	public Player() {

	}

	public void run() {
		try {
			while (countCard < 30) {
				countCard = countCard + playingField.get();
				System.out.println(currentThread().getName()+countCard);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("player card left");
		}
	}


}
