package lesson6.InOutSystem;

// TODO: 9/1/2021 Use CTRL+ALT+L [Pavel.Chachotkin]
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

// TODO: 9/1/2021 Must not be commented code in project without reason in comment [Pavel.Chachotkin]
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
