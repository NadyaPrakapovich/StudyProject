package lesson6.InOutSystem;

import java.util.Random;
import java.util.UUID;

public class IdCard {
	private String idCard;

	public String getIdCard() {
		return idCard;
	}

	public String createIdCard() {
		idCard = UUID.randomUUID().toString().substring(3, 13);
		return idCard;
	}

//private final int[] number = new int[10];
//	public int[] createId() {
//		Random rnd = new Random();
//		for (int i = 0; i < 10; i++) {
//			number[i] = rnd.nextInt(10);
//		}
//		// System.out.println(number);
//		return number;
//	}


}
