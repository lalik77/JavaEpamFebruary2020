package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Week {

    /* Q36 */
    // private static final String monday; // not compile because final
    String tuesday;
    // final static wednesday; // nor compile because there is no data type

    final protected int thursday = 4;
   //private static final long number; // not compile because final
   private static long number; // removed final


    public static void main(String[] args) {

        System.out.println( new Week().thursday );
    }
}
