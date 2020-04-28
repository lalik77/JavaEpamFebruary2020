package com.oca_ocp.oca_ch5_using_loop_constructs;

// Q 38
public class Loop {

    private static int count; // by default 0
    private static String[] stops = new String[] { "Washington","Monroe","Jackson","LaSalle"};





    public static void main(String[] args) {

        //System.out.println(count);// => set to default value == 0
       //  System.out.println(stops[0].length()); length of Washington
        while ( count < stops.length) { // begin of the loop

            if( stops[count++].length() < 8 ) {
                break;

            }
            System.out.println("Count inside loop after break statment "+ count); // => 1


        } // end of the loop
        System.out.println("Count after the loop " + count);

    }

}
