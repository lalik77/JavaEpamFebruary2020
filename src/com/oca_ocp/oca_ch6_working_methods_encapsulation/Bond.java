package com.oca_ocp.oca_ch6_working_methods_encapsulation;

import lesson200204.B;

public class Bond {

    private static int price = 5;

    public boolean sell(){
        if(price<10) {

            price ++;
            return true;

        }else if (price >=10) {
            return false;
        }
        return true; // missing return statement , it does not compile

    }

    public boolean buy(){

        if (price>4) {
            price+=10;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();
        System.out.println(price);

        new Bond().buy();
        new Bond().buy();
        System.out.println(price);
    }


}
