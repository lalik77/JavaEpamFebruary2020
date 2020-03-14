package com.oca_ocp.ocp_ch13_generics_and_collections;



public class Compile {

    /* Q1 code snippet */

    // public class News<?>{} // error

   // public class News<Object>{} //  not error bad practice
    public class News<News>{} // not error bad practice

    public static void main(String[] args) {

    }
}
