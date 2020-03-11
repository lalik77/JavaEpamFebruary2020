package com.oca_ocp.oca_ch8_handling_exceptions;

import java.util.Arrays;

public class Attendance {

    // private Boolean[] list = null; // => java.lang.NullPointerException
    //private Boolean[] list = ( Boolean[] ) new Object(); // => java.lang.ClassCastException
    private Boolean[] list = new Boolean[5]; // without fill Arrays =>java.lang.NullPointerException


    public int printTodaysCount() {

        Arrays.fill(list,false); // => java.lang.ArrayIndexOutOfBoundsException: 5

        int count=0;
        for( int i=0 ; i<10 ; i++ ) {

            if(list[i]) ++count;
        }

        return count;
    }

    public static void main(String[] roster) {

        new Attendance().printTodaysCount();

    }
}
