package Lesson13.Play;

import static java.lang.Thread.sleep;

public class Leading implements Runnable {
	PlayingField playingField;
	final int allCountCard= 20;
	int countCard = 0;

	public Leading(PlayingField playingField) {
		this.playingField = playingField;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			playingField.get();

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
