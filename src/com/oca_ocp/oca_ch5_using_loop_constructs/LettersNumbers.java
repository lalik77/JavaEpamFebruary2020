package com.oca_ocp.oca_ch5_using_loop_constructs;

public class LettersNumbers {

    public static void main(String[] args) {
        letters : for ( char ch = 'a' ; ch <='z' ; ch++) {
            numbers : for ( int n=0 ; n<=10 ; n++ ) {
                System.out.println(ch);
                //break;
                continue letters;
                //break numbers;
               // break letters;

            }
        }
    }
}
