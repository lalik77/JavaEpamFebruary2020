package com.oca_ocp.oca_ch5_using_loop_constructs;

public class Q31 {
    static int count = 0;

    public static void main(String[] args) {


        int k = 0;

        for (int i = 10; i > 0; i--) {

            while (i > 3) {
                i -= 3;
                System.out.println("count "+ count + " i " + i);
                count++;
            }
            {
                System.out.println("k "+k + " i " + i);
                k += 1;
            }


        }
        System.out.println(k);
    }
}
