package com.oca_ocp.oca_ch9_working_selected_classes_java_api;

public class HappyString {

    /* Q39 code snippet */


    public static void main(String[] args) {

        String happy = " :) - (: ";
        //System.out.println(happy);
        String really = happy.trim();
        //System.out.println(really);
        // String question = happy.substring(0,happy.length()); // - > false
        String question = happy.substring(1,happy.length()-1);

        System.out.println(really.equals(question));

    }
}
