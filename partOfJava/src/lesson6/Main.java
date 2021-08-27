package lesson6;

import lesson6.InOutSystem.DevOps;
import lesson6.InOutSystem.Director;
import lesson6.InOutSystem.ITDapartment;
import lesson6.InOutSystem.Teamlead;
import java.lang.System;

public class Main {
	public static void main(String[] args) {
		ITDapartment itDapartment = new ITDapartment("Vasya", "Ivanov");
		itDapartment.register(itDapartment);
		itDapartment.printEmployee();

		DevOps devOps = new DevOps("Fedya", "Sidorov");
		devOps.register(devOps);
		devOps.printEmployee();

		Director director = new Director("Ivan", "Petrov");
		director.register(director);
		director.printEmployee();

		//devOps.findInSystem("Ivan", "Petrov", "65868d76-b6e0-4ec6-afc2-71297fc19413");
		//devOps.openDoor();


	}
}
