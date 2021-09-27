package Lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
		arrayList2.add(new Phone("BB", 100));
		arrayList2.add(new Phone("CCC", 200));
		arrayList2.add(new Phone("A", 150));

		getPrice(arrayList2);

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

	// method not return ArrayList<Price>
	public static ArrayList<Price> getPrice(ArrayList<Phone> phoneArrayList) {

		ArrayList<Price> priceArrayList = new ArrayList<>();

	 phoneArrayList.stream()
				.sorted((p1, p2) -> {
					int compareByName = p1.getName().length() - p2.getName().length();
					if (compareByName == 0) {
						return p2.getPrice() - p1.getPrice();
					}
					return compareByName;
				})
				.forEach(s-> System.out.println(s.getPrice()));

		return priceArrayList;
	}


}