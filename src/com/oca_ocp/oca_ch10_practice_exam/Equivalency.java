package com.oca_ocp.oca_ch10_practice_exam;

public class Equivalency {


    public static void main(String[] edges ) {

        final String ceiling = "up";
        String ceilingMy = "up";
        String floor = new String("up");
        final String wall = new String(floor);

        System.out.println((ceiling == wall)); // false
        System.out.println(ceiling.equals(wall));//true


        System.out.println((floor == ceiling));//false
        System.out.println(floor.equals(ceiling));//true

        System.out.println((wall == floor));//false
        System.out.println(wall.equals(floor));//true

        System.out.println(ceiling == ceilingMy);//true because of string pool;

    }
}
