package com.oca_ocp.oca_ch8_handling_exceptions;

public class FootBall {

     /*Q9 */
    public static void main(String[] args) {

        try {

            System.out.println('A');
            throw new RuntimeException("out of bounds");

        }catch(ArrayIndexOutOfBoundsException aioobe){

            System.out.print('B');
            //throw t;
        }
        finally {
            System.out.print('C');
        }

    }
}
