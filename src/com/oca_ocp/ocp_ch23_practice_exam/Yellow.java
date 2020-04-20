package com.oca_ocp.ocp_ch23_practice_exam;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//Q70

public class Yellow {
    public static void main(String[] args) {

        List list = Arrays.asList("Sunny","Happy");

        method(list);
    }

    private static void method(Collection<?> x) {
        x.forEach(a->{
            System.out.println("hello");
        });

    }
}
