package Lesson16;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("service");
		arrayList.add("simple");
		arrayList.add("series");
		arrayList.add("world");

		task1(arrayList);

	}


	public static ArrayList<String> task1(ArrayList<String> arrayList) {
		arrayList.stream().forEach(s -> System.out.println(s));
return arrayList;
	}

}