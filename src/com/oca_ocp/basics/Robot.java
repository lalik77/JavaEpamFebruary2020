package com.oca_ocp.basics;




public class Robot {

                static String weight = "A lot";
    /*Default*/ double ageMonths = 5 , ageDays = 2 ;
                private static  boolean success = true;

    public /*static*/  void main(String[] args) {

        final String retries = "1" ;
         // P1
         weight=""; // class var
         ageMonths = 0 ; // available because the main is not static
         ageDays = 0;  // available available because the main is not static
         success = false; // available class var
    }


    public static void foo () {

       // ageMonths , ageDays // not available from static context


    }

}
