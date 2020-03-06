package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Drink {

    public static void water(){}
    public void get() {

        water();
        this.water();
        Drink.water();
        // this.Drink.water ; // error
    }
}
