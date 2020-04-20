package com.oca_ocp.ocp_ch13_generics_and_collections;


import java.util.ArrayList;
import java.util.List;

public class Compile {

    /* Q1 code snippet */

    List<?> list = new ArrayList<>();

     //public class News<?>{} // error

   // public class News<Object>{} //  not error bad practice
    public class News<News>{} // not error bad practice

    //public static void main(String[] args) {




}

class A <T>{



    A<?> object = new B();
}

class B extends A {


}
