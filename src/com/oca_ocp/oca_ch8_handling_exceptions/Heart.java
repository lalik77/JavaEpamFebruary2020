package com.oca_ocp.oca_ch8_handling_exceptions;

class Organ {

    public void operate() throws RuntimeException {

        throw new RuntimeException("Not supported");

    }
}



public class Heart extends Organ {
    public void operate() throws NullPointerException /* throws Exception */ { // error
         System.out.println("beat");

    }

    public static void main(String[] args) {
        try{

            new Heart().operate();
            new Organ().operate();
        }finally {

        }
    }


}
