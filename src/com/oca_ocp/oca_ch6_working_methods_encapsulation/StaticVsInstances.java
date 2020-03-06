package com.oca_ocp.oca_ch6_working_methods_encapsulation;

import java.util.ArrayList;

public class StaticVsInstances {
    /*Q33 Static method or static initializer cannot references instance var*/

    private int x;

    static { // static initialiser

        // x=10;
    }

    static void myFoo(int a) {     // static method
       // x=a; // error
    }


}
