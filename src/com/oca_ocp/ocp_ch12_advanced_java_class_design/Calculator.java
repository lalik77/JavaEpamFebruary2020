package com.oca_ocp.ocp_ch12_advanced_java_class_design;

// Q35
interface AddNumbers {

    int add(int x, int y);

    static int substract (int x , int y ) {
        return x-y;

    }

    default int multiply (int x, int y ){
        return x*y;

    }
}

public class Calculator {

    protected void calculate (AddNumbers add, int a , int b) {

        System.out.println(add.add(a,b));
    }


    public static void main(String[] args) {

        final Calculator ti = new Calculator();
        ti.calculate( (k,p)->k+p+1,2,5);

    }
}
