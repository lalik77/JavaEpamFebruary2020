package com.oca_ocp.oca_ch9_working_selected_classes_java_api;

import java.time.Period;


/*Q37 code snippet */
public class MyPeriod {

    public static void main(String[] args) {

        Period period1 = Period.ofWeeks(1).ofDays(3);
        Period period2 = Period.ofDays(10);

         System.out.println(period1.toString() + " " + period2.toString());

    }
}
