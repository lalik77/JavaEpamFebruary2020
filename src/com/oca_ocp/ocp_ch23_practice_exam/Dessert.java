package com.oca_ocp.ocp_ch23_practice_exam;

import java.util.Optional;

//Q9
public class Dessert {

    public static void main(String[] yum) {
        eatDessert(Optional.empty());



    }

    private static void eatDessert(Optional<String> opt ) {

        System.out.println(opt.orElse("No dessert today"));
        System.out.println("----------------------");
        System.out.println(opt.orElseGet(()->"No dessert today"));
    }



}
