package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class AreYouBob {
    public static void main(String[] args) {

        String bob = new String ("bob");
        String notBob = bob;
        System.out.println( ( bob==notBob ) + " " + ( bob.equals(notBob) ) ); // true true
        System.out.println( bob==notBob  + " " ); // false
        System.out.println( ( bob==notBob ) + " " ); // true

    }
}
