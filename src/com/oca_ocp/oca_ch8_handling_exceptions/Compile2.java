package com.oca_ocp.oca_ch8_handling_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compile2 {

     void myFoo1() {

        try {
            throw new RuntimeException();

        }catch(ClassCastException e) {

            System.out.println("I am ClassCast...");
        }catch (IndexOutOfBoundsException e) {

            System.out.println("I am IndexOutOfBound....");
        }
    }


    static void myFoo2() throws IOException {

         throw new FileNotFoundException();

    }

    public static void main(String[] args) throws IOException {
        new Compile2().myFoo1();

        myFoo2();

    }
}
