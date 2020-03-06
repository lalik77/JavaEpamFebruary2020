package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Puppy {

    public static int wag=5;
    public void Puppy(int wag){ // not constructor
        this.wag=wag;
    }

    public static void main(String[] args) {
        System.out.println(new Puppy());
        //System.out.println(new Puppy(2)); // error
    }
}
