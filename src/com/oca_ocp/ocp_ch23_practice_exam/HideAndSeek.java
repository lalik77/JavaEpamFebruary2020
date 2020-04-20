package com.oca_ocp.ocp_ch23_practice_exam;

//Q58

import java.util.function.Predicate;
import java.util.stream.Stream;

public class HideAndSeek {


    public static void main(String[] args) {
        Stream<Boolean> stream = Stream.of(true,false,false);
        Predicate<Boolean> pred = t->t;
        boolean found = stream.filter(pred).allMatch(pred);

        System.out.println(found);


;    }
}
