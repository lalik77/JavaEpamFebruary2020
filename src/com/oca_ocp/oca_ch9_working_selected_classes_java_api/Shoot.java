package com.oca_ocp.oca_ch9_working_selected_classes_java_api;


/*Q17 code snippet*/
public class Shoot {

    interface Target {

        boolean needToAim(double angle);
    }

    static void prepare(double angle, Target t) {

        boolean ready = t.needToAim(angle); // k1

        System.out.println(ready);
    }

    public static void main(String[] args) {
        prepare(45, d -> d > 5 || d< -5);
    }
}
