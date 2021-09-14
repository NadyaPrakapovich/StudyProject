package Lesson13.Play;

public class PlayingField {
	int allCountCard = 10;
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
			System.out.println("Игрок выложил 1 карту");
			System.out.println("У игрока осталось " + (allCountCard - nowCountCard) + " карт");
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
		System.out.println("Ведущий забрал " + nowCountCard);
		int nowCountCard2 = allCountCard - nowCountCard;
		System.out.println("У игрока осталось " + (nowCountCard2));
		allCountCard = nowCountCard2;
		nowCountCard = 0;
		notify();
	}
}