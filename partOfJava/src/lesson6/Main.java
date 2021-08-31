package lesson6;

import lesson6.InOutSystem.*;

import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        ITDapartment itDapartment = new ITDapartment("VasyaIt", "Ivanov");
        ITDapartment itDapartment1 = new ITDapartment("VasyaIt1", "Ivanov1");
        ITDapartment itDapartment2 = new ITDapartment("VasyaIt2", "Ivanov2");
        journal.registration(itDapartment, itDapartment1, itDapartment2);

        DevOps devOps = new DevOps("FedyaDev", "Sidorov");
        DevOps devOps1 = new DevOps("FedyaDev1", "Sidorov1");
        journal.registration(devOps, devOps1);

        Director director = new Director("IvanDir", "Petrov");
        Director director1 = new Director("IvanDir1", "Petrov1");
        Director director2 = new Director("IvanDir2", "Petrov2");
        Director director3 = new Director("IvanDir3", "Petrov3");

        journal.registration(director, director1, director2, director3);

        Director director5 = new Director("ffff", "fff");
        journal.registration(director5);
        journal.getAllEmployee();

        Room<ITDapartment> room = new Room<>(itDapartment2);
        room.enterTheRoom();
        Room<Director> room1 = new Room<>(director5);
        room1.enterTheRoom();
        Room<DevOps> room3 = new Room<>(devOps);
        room1.enterTheRoom();
        System.out.println(room.getcountEmployeeTheRoom());
    }
}
