package com.oca_ocp.oca_ch9_working_selected_classes_java_api;


/* Q30 code snippet */
public class CountDown {

    public static void main(String[] args) {
        String builder = "54321" ;  // a String of length() 5;

        builder = builder.substring(4); // a String of length() ;
        //System.out.println(builder);// -> 1
        System.out.println(builder.charAt(2)); // exception ->  StringIndexOutOfBoundsException

    }
}
