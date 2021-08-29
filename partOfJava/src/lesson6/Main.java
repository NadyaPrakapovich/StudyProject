package lesson6;

import lesson6.InOutSystem.*;

import java.lang.System;

public class Main {
	public static void main(String[] args) {
		Journal journal = new Journal();

		ITDapartment itDapartment = new ITDapartment("VasyaIt", "Ivanov");
		journal.registration(itDapartment);

		DevOps devOps = new DevOps("FedyaDev", "Sidorov");
		journal.registration(devOps);

		Director director = new Director("IvanDir", "Petrov");
		journal.registration(director);

		Director director1=new Director("ffff","fff");
		journal.registration(director1);


		journal.chekIdCard(director.getIdCard());
		journal.getAllEmployee();

		//director.enterTheOffice(director);
	}
}
