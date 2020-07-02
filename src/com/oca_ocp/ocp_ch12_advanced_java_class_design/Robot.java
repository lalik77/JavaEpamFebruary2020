package com.oca_ocp.ocp_ch12_advanced_java_class_design;

// Q17

interface Pump {

    void pump(double psi);
}

interface Bend /*extends Pump*/ {

    void bend(double tensileStrength);
}

public class Robot {

    public static final void apply (/*Bend*/Bend instruction , double input ) {

        instruction.bend(input);
    }

    public static void main(String[] args) {
        final Robot r = new Robot();
        r.apply( x -> System.out.println(x + "bent!"),5 );
    }
}
