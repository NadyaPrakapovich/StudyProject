package Lesson13.Play;

public class Leading extends Thread {
	PlayingField playingField;
	int countCard = 0;

	public Leading(PlayingField playingField) {
		this.playingField = playingField;
	}

	public void run() {
		try {
			while (countCard < 30) {
				countCard = countCard + playingField.get();
				System.out.println("leading has card"+countCard);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Count card left");
		}
	}
}
