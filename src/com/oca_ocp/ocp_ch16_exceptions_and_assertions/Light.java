package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

import java.io.IOException;

public class Light {

    public void turnOn() throws IOException {
        /*throw*/ new IOException("Not Ready");
    }

    public static void main(String[] b) throws Exception {

        try{
            new Light().turnOn();
        } catch (RuntimeException e) {
            System.out.println(e);
            throw new IOException();
        }finally {
            System.out.println("complete");
        }

    }
}
