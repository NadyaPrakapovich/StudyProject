package Lesson13.Play;

import static java.lang.Thread.sleep;

public class Player implements Runnable {
	PlayingField playingField;
	int countCard = 10;
	int currentCountCard = countCard;

	public Player(PlayingField playingField) {
		this.playingField = playingField;
	}

	public void run() {
		for (int i = 0; i < countCard; i++) {
			playingField.put();

		}

	}
}

