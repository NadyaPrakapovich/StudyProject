package lesson5.Task1_Birds;

import java.lang.System;

public class Birds {
	final String kind;
	public double weight;
	static double allWeight;


	// конструктор
	public Birds(String kind, double weight) {
		this.kind = kind;
		this.weight = weight;
	}

	public Birds(String kind) {
		this.kind = kind;
		this.weight = 0;
	}

	public double setWight(double weight) {
		return this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getKind() {
		return kind;
	}

	static public void sumWeight(double weight) {
		allWeight = allWeight + weight;
		System.out.println(allWeight);
	}
}
