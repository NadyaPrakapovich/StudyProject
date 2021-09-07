package Lesson10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        divideToWord();

        divideToSentences();

        ArrayList<String> str = new ArrayList<>();
        str.add("summer ");
        str.add("autumn ");
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
            System.out.println(arraySentence[s]);
        }
    }

    public static ArrayList<String> joinListString(ArrayList<String> str) {
        ArrayList<String> newStr = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            newStr.add(str.get(i));
        }
        return newStr;

    }


}