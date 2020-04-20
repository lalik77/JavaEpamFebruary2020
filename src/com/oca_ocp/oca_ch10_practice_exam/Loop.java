package com.oca_ocp.oca_ch10_practice_exam;

public class Loop {

    public static void main(String[] args) {


        int result =8;
        loop : while ( result > 7 ) {
            result++;
            do {
                result -- ;

            }while (result > 5);
           // break loop;
        }

        System.out.println(result);
    }
}
