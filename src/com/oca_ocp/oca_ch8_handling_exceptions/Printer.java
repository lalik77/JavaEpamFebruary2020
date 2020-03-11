package com.oca_ocp.oca_ch8_handling_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Printer {

    public void print () {

        try{
            throw new FileNotFoundException();
        } catch (IOException e)

        {
            System.out.print('Z');

            // in wrong order IOException is superclass of FileNotFoundException
        } // catch (FileNotFoundException f) {    System.out.println('Y');     }

        finally {
            System.out.println('Y');

        }

    }

    public static void main(String[] args) {
        new Printer().print();
    }
}


