package com.oca_ocp.oca_ch5_using_loop_constructs;

public class Test {

    public static void main(String[] args) {

        for (int i=0 ; i<3 ; i++) {

            for (int j=3;j>=0;j--) {

              if (i==j) break;
                System.out.println(i+" "+ j);
            }
        }

        System.out.println("end");

    }
}
