package Lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("service");
        arrayList.add("vortex");
        arrayList.add("series");
        arrayList.add("world");
        arrayList.add("dfdfgserjj");
        arrayList.add("dgv");

        ArrayList<String> arrayList1 = task1(arrayList);
        for (String s : arrayList1) {
            System.out.println(s);
        }

        System.out.println("--------------------");
        System.out.println(task2(arrayList));

        System.out.println("--------------------");

        ArrayList<Phone> arrayList2 = new ArrayList<>();
        arrayList2.add(new Phone("BB",(new Price(100))));
        arrayList2.add(new Phone("CCC", (new Price(200))));
        arrayList2.add(new Phone("A", (new Price(150))));


       ArrayList<Price> priceArrayList= getPrice(arrayList2);
        for ( Price  p: priceArrayList) {
            System.out.println(p.getValue());
        }
    }


    public static ArrayList<String> task1(ArrayList<String> arrayList) {
        ArrayList<String> arrlist = (ArrayList<String>) arrayList.stream()
                .filter(s -> !s.contains("ser"))
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        return arrlist;
    }


    public static String task2(ArrayList<String> arrayList) {

        String str = arrayList.stream()
                .filter(s -> s.contains("vor"))
                .findFirst().orElse("No elements");

        return str;
    }

    public static ArrayList<Price> getPrice(ArrayList<Phone> phoneArrayList) {

        ArrayList<Price> priceArrayList;

        priceArrayList=  phoneArrayList.stream().sorted(Comparator.comparing(Phone::getName))
                .collect(ArrayList::new,(list, p)->list.add(p.getPrice()), ArrayList::addAll);

        return priceArrayList;
    }


}