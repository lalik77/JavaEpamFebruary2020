package com.oca_ocp.basics;

public class ParkRanger {

    /*non static*/ int birds = 10;

    public static void main(String[] args) {
        int trees=5;
        // System.out.println(trees + birds); // no access to birds , no access from static context
        ParkRanger parkRanger = new ParkRanger();
        System.out.println(parkRanger.birds);
    }
}
