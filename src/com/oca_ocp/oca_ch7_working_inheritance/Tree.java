package com.oca_ocp.oca_ch7_working_inheritance;

public class Tree {

    public final static long numberOfTrees;
   ///public final  double height;

  /* final */ static int var;

    static{}

    static {
        numberOfTrees=100;
        // height =4; // sttic init cannot have access to height
    }

}
