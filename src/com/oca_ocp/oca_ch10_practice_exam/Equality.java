package com.oca_ocp.oca_ch10_practice_exam;

import java.time.LocalTime;

public class Equality {

    public static /* static */ void main(String[] args) throws InterruptedException {

        System.out.println(new StringBuilder("zelda") == new StringBuilder("zelda")); // false
        System.out.println( 3 == 3 ); // true
        System.out.println("bart" == "bart"); // true
        System.out.println( new int[0] == new int[0] ); // false
        System.out.println(LocalTime.now() == LocalTime.now()); // false

        System.out.println(LocalTime.now());
        LocalTime now = LocalTime.now();
        Thread.sleep(100);
        LocalTime now1 = LocalTime.now();

        System.out.println(now==now1);
        System.out.println(now.equals(now1));
    }
}
