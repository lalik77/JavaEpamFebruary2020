package com.oca_ocp.oca_ch10_practice_exam.ranch;

public class Cowboy {

    private  int space = 5;
    private double ship = space < 2 ? 1: 10 ;

    public void printMessage() {

        if(ship>1) {

            System.out.println("Goodbye");
        } if (ship<10 && space>=2) System.out.println("Hello");
        else System.out.println("See you again");

    }

    public static final void main(String[] args) {

        new Cowboy().printMessage();

    }
}
