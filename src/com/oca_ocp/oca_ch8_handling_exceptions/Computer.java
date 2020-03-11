package com.oca_ocp.oca_ch8_handling_exceptions;

public class Computer {

    public void compute () throws Exception {

        throw new RuntimeException("Error processing!");
    }

    public static void main(String[] args) throws Exception {

        try {

            new Computer().compute();
            System.out.println("Ping");

        } catch (NullPointerException e) {
            System.out.println("Pong");
            throw e;
        }
    }
}
