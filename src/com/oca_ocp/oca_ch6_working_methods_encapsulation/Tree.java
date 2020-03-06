package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Tree {

    public static /*final*/ long numberOfTrees;
    public /*final*/ double height;

    static {}
    {
        final int initHeight = 2 ;
        height = initHeight;
    }

    static {

        // height = 4 ; // error no access from static initialiser to instance var
        numberOfTrees=100;
    }

}
