package Lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("service");
		arrayList.add("vortex");
		arrayList.add("series");
		arrayList.add("world");
		arrayList.add("dfdfgserjj");
		arrayList.add("dg");

		ArrayList<String> arrayList1 = task1(arrayList);
		for (String s : arrayList1) {
			System.out.println(s);
		}

		System.out.println("--------------------");
		System.out.println(task2(arrayList));

	}


	public static ArrayList<String> task1(ArrayList<String> arrayList) {
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist = (ArrayList<String>) arrayList.stream().filter(s -> !s.contains("ser")).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

		return arrlist;
	}


	public static String task2(ArrayList<String> arrayList) {

		String str = arrayList.stream().filter(s -> s.contains("vor")).findFirst().orElse("No elements");

		return str;
	}

}