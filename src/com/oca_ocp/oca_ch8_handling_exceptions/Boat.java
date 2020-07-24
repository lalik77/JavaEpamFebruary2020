package com.oca_ocp.oca_ch8_handling_exceptions;

class CapsizedException extends Exception {}

class Transport {
    public int travel() throws CapsizedException {return 2;}
}

public class Boat {
public int travel() throws Exception {

   // int a=5/0;

   // return 4;
    throw new RuntimeException();


}

    public static void main(String[] args) throws Exception {
    try {
        System.out.println(new Boat().travel());
    }catch (Exception e) {
        System.out.println(8);
    }

    }
}
