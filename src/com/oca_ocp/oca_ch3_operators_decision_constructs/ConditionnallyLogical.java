package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class ConditionnallyLogical {

    public static void main(String... data) {

        if( data.length>=1
                &&  ( data[0].equals("sound")  || data[0].equals("logic") )
                && data.length<2 ) {
            System.out.println(data[0]);
        }
        }
    }

