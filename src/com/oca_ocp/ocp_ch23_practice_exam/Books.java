package com.oca_ocp.ocp_ch23_practice_exam;

import java.util.stream.IntStream;

// Q73
public class Books {

    public static void main(String[] args) {
        IntStream  pages = IntStream.of(200,300);
        long total = pages.sum();
        long count = pages.count(); // will throw
                                    // java.lang.IllegalStateException:
                                   // stream has already been operated upon or closed


        System.out.println(total + " - " + count);
    }
}
