package Lesson16;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("service");
        arrayList.add("vortex");
        arrayList.add("series");
        arrayList.add("world");

        task1(arrayList);

       // System.out.println(task2(arrayList));

    }


    public static ArrayList<String> task1(ArrayList<String> arrayList) {
       // ArrayList<String> arrlist = new ArrayList<>();
      arrayList.stream().filter(s -> s.contains("ser")).forEach(s -> System.out.println(s));
       //  arrayList.stream().dropWhile(s -> s.contains("ser")).forEach(s -> System.out.println(s));




        return arrayList;
    }


    public static String task2(ArrayList<String> arrayList) {

        String str = arrayList.stream().filter(s -> s.contains("vor")).findFirst().orElse("No elements");

        return str;
    }

}