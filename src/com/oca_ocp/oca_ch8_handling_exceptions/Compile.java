package com.oca_ocp.oca_ch8_handling_exceptions;

import lesson200204.B;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class Compile {

    static void my_function(int a, int b) throws Exception {

        try {

            System.out.println("Division a : b = " + a/b);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            throw  new Exception("Cannot divide by zero");
        }



    }

    public static void main(String[] args) throws Exception {

        //new ExceptionVsIOException().foo();

        // my_function(3,0);


        /*Q33 code snippet*/

        System.out.println("Q33 code snippet");

       /* final Object  exception = new Exception();
        final Exception data = (RuntimeException)exception ;
        System.out.println(data);*/

        /*final Object object = new Integer(2);
        final Number number =(Integer) object;
        System.out.println(number);*/

       /* Integer i = (Integer) new Object();
        System.out.println(i);*/


        final Object o = new Integer(4);
        byte b = (Byte) o ;

        System.out.println(b);








        /* Q39 code snipet*/
        System.out.println("Q39 code snipet");
        String s =null;

        try {

            System.out.println(s.length());

        }catch(RuntimeException e){
            System.err.println("runtime exception");
        }

    }
}

class ExceptionVsIOException {

    public int myfunc() throws IOException{ return 1;}

    public void foo() {

        Scanner sc= new Scanner(System.in);
        try {
            int a=sc.nextInt();
            System.out.println(a);
            myfunc();

        }catch(IOException ex){ // Must appear before block Exception because IOException is subclass of Exception

            ex.printStackTrace();

        }catch (Exception e) {
            //e.printStackTrace();

            System.out.println("Exception");
        }



    }
}
