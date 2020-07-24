package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

class MissedCallException extends  RuntimeException {}
public class Phone {

    static void makeCall() throws RuntimeException {
         //System.out.println("Makecall");
         throw new ArrayIndexOutOfBoundsException("Call");
    }

    public static void main(String[] args) {

        try {
            makeCall();
        }catch ( /*MissedCallException*/ RuntimeException e) {
            //System.out.println("Exception in catch");
            //throw  new RuntimeException("Voicemail");
            throw e;

        }finally {
            System.out.println("text");
           // throw new RuntimeException("Text");

        }
    }


}
