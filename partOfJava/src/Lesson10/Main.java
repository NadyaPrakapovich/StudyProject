package Lesson10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		divideToWord();

		divideToSentences();

		ArrayList<String> str = new ArrayList<>();
		str.add("summer");
		str.add("autumn");
		str.add("winter");
		str.add("spring");

		System.out.println(joinListString(str));

	}

	public static void divideToWord() {
		String str = "Магнитное поле решает непреложный метеорит.";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public static void divideToSentences() {
		String str = "Магнитное поле решает непреложный метеорит. Маятник Фуко, несмотря на внешние воздействия, представляет собой эффективный диаметp! Надир решает космический узел?";
		String[] arraySentence = str.split("[.|?|!]");

		for (int s = 0; s < arraySentence.length; s++) {
			System.out.println(arraySentence[s].trim());
		}
	}

	public static String joinListString(ArrayList<String> str) {
		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i < str.size(); i++) {
			newStr.append(str.get(i));
			if (i != str.size() - 1) {
				newStr.append(", ");
			}
		}
		return newStr.toString();

	}

//маскa для определения валидно ли введен номер телефона

//	а) 123-45-67				(\d{3})-(\d{2})-(\d{2})
//
//	б) 8 (025) 123-45-67		[8]+\s\(+(\d{3})+\)+\s(\d{3})-(\d{2})-(\d{2})
//
//	в) +375(25)123-45-67		\++[3][7][5]+\(+(\d{2})+\)+(\d{3})-(\d{2})-(\d{2})

}
