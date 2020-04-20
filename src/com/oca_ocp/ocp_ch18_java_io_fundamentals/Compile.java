package com.oca_ocp.ocp_ch18_java_io_fundamentals;


import java.io.ByteArrayInputStream;

public class Compile {

   static byte[] buf = {5,6,7,8,9};

    public static void main(String[] args) {

        byte[] buf_local = {1,2,3,4,5,6,7,8};

        //Create new byte array stream
        ByteArrayInputStream exam = new ByteArrayInputStream(buf);

        //print bytes
        System.out.println(exam.read());

        //Skips 1 element
        exam.skip(1);

        System.out.println(exam.read());
        System.out.println(exam.read());

        // Create a new byte array input stream
        ByteArrayInputStream exam2 = new ByteArrayInputStream(buf_local);
        System.out.println("****************");

        //print bytes
        System.out.println(exam2.read());
        //Skip 3elements
        exam2.skip(3);
        System.out.println(exam2.read());
        System.out.println(exam2.read());

    }

}
