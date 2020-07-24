package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

public class Fetch {

    public int play(String dogName) throws Exception {
        try {
            throw new  RuntimeException(dogName);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static final void main(String[] args) throws Exception {

        //new Fetch().play("webby");
        new Fetch().play("jjj");

    }


}
