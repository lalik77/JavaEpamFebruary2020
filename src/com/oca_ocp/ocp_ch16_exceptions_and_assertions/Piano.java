package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

import java.io.FileNotFoundException;

class OutOfTuneException extends Exception {
    OutOfTuneException (String messge) { super(messge);}
}

public class Piano {
    public void play() throws OutOfTuneException,FileNotFoundException {
        throw new OutOfTuneException("Sour Note");
    }

    public static void main(String[] args) throws OutOfTuneException,FileNotFoundException {

        final Piano piano = new Piano();

        try {
            piano.play();

        }catch (Exception e) {
            throw e ;
        }finally {
            System.out.println("Song finished");
            throw new RuntimeException("finally");
        }

    }
}
