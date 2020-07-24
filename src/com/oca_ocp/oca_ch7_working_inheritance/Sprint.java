package com.oca_ocp.oca_ch7_working_inheritance;

//Q14
interface Run {
    void run();
    /*default void walk() {
        System.out.println("W a R");

    }*/
}

    interface Jog {
        void jog();
        default void walk() {
            System.out.println("W a J");
        }
    }

    public class Sprint implements Run, Jog {

        public void run(){}
        public void jog(){}


        public void walk() {
            System.out.println("Sprinting");

        }

        public static void main(String[] args) {
            new Sprint().walk();
        }
    }

