package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class Kansas {

    public static void main(String[] args) {
        int colorOfRainbow = 10;
        final int red = 5; // without final will be error on compile

        switch (colorOfRainbow) {

            default:
                System.out.println("Home");
                break;
            case red : // error without final statement
                System.out.println("Awaya");
        }
    }
}
