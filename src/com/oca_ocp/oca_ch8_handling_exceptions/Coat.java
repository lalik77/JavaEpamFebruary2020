package com.oca_ocp.oca_ch8_handling_exceptions;

public class Coat {

    public Long zipper() throws Exception {

        try {

          //String checkZipper = (String) new Object();
            String checkZipper = "kkk";
            //Integer i = (Integer) new Object();

            System.out.println(checkZipper);
           // System.out.println(i);
            /*Object exception = new Exception();
            Exception data = (RuntimeException) exception;*/
        }catch (Exception e) {

            throw new RuntimeException();
        }

        return null;
    }

    public static void main(String... warmth) {



        try{
            new Coat().zipper();
            System.out.println("Finished");

        }catch (Throwable t) {}

    }
}
