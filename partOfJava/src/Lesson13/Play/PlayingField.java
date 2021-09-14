package Lesson13.Play;

public class PlayingField {
	final int N = 30;
	int nowCountCard = 0;

synchronized boolean put(){
	if (nowCountCard<=N){
		nowCountCard++;
		System.out.println("card add on field");
		return true;
	}
	return false;
}

	synchronized int get(){
		if (nowCountCard >0) {
			nowCountCard--;
			System.out.println("Card on field "+nowCountCard);
			return 1;

		}
		return 0;
	}
}
