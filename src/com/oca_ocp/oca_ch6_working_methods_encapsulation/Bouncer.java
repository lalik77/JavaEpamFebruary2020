package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Bouncer {

    protected int bounce;
}

class SubBouncer extends Bouncer {

    public static void main(String[] args) {
        System.out.println(new Bouncer().bounce);// accees from subclass to protected var bounce as sub class
                                                // see class BouncerSamePackage to view acces to protected var bounce in the same
                                               // package
    }
}