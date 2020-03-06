package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class BouncerSamePackage {

    public static void main(String[] args) {
        System.out.println(new Bouncer().bounce);// access to protected var bounce in the same package .
    }
}
