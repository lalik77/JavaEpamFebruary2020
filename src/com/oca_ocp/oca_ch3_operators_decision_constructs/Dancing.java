package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class Dancing {

    public static void main(String[] args) {

        //int leaders = 10*(2+(1+2/5); // error
        int leaders = 10*(2+(1+2/5) ); // the missing parenthese
        int followers = leaders*2;

        System.out.println(  leaders+followers < 10 ? "Too few " : "Too many " );
    }
}
