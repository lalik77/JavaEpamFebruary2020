package com.oca_ocp.oca_ch7_working_inheritance;

/* Q35 */

interface CanFly {

    // public void fly(){} // interface abstract method cannot have body , only with default keyword


    public abstract void fly() ;
    public static final int a=5;
}

/* final*/ class Bird {

    // public int fly(int speed ){ } // missing return statement
}



public class Eagle extends Bird implements CanFly {

    public void fly(){}
}
