package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class Pieces {

    public static void main(String[] info) {

        int flair = 15 ;
        if (flair >= 15 && flair < 37 ) {

            System.out.println("Not enough");
        }
        if (flair==37) {
            System.out.println("Just right");

        }else {
            System.out.println("Too many");
        }

    }
}
