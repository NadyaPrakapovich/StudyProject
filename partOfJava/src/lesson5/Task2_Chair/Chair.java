package lesson5.Task2_Chair;

import java.lang.System;

public class Chair {
    String colour;
    boolean softness;
    int height;
    int wight;

    public Chair(String colour, boolean softness) {
        this.colour=colour;
        this.softness=softness;
    }


    public class legs {
        String materialLegs;

        public legs(String material) {
            this.materialLegs = material;
        }
    }

    public class back {

        public void moveBack() {
        }

        public void moveForward() {

        }
    }

    public class seat {
         String materialSeat;

    }
}