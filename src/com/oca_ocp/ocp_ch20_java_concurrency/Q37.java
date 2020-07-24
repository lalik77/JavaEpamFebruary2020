package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
//Q37
public class Q37 {

    static List<Integer> db = Collections.synchronizedList(new ArrayList<>());
    static void p1() {
        IntStream.iterate(1,i->i+1)
                .limit(5)
                .parallel()
                .map( i-> { db.add(i);return i;})
                //.forEachOrdered(System.out::print);
                .forEach(System.out::print);

    }

    static void p2() {
        db.forEach(System.out::print);
    }

    public static void main(String[] args) {
        p1();
        System.out.print("\n");
        p2();
    }
}
