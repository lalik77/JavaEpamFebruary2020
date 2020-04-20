package com.oca_ocp.oca_ch7_working_inheritance;

public class WhaleSharkException extends Exception {

    public WhaleSharkException() {
        super("Friendly Shark!");
    }

    public WhaleSharkException(String message) {
        super( new Exception( new WhaleSharkException() ));
    }

    public WhaleSharkException(Exception cause ) {}

}
