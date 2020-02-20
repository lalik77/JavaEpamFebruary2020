package com.homeworks.hackerrank;

import java.util.Scanner;

/**

 @author   Mami Alex

 **/


public class JavaIntToString {


    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in); // only this part of code to write

        int n = scan.nextInt();
        String s=Integer.toString(n);

        System.out.println("this is a String type variable " + s);

    }

}
