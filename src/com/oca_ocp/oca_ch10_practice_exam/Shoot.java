package com.oca_ocp.oca_ch10_practice_exam;

public class Shoot {

    @FunctionalInterface
    interface Target {

        boolean needToAim (double angle);
    }

    static void prepare (double angle , Target t) {

        boolean ready = t.needToAim(angle);
        System.out.println(ready);
    }

    public static void main(String[] args) {
        prepare(-8, d -> d > 5 || d < -5 );
    }
}
