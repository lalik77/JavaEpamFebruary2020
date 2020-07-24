package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.Arrays;
//Q12
public class Bounce {

    public static void main(String[] args) {
        Arrays.asList(1,2,3,4).stream().forEach(System.out::println);

        Arrays.asList(1,2,3,4).parallelStream().forEach(System.out::println);

        Arrays.asList(1,2,3,4).parallelStream().forEachOrdered(System.out::println);
    }
}
