package com.homeworks.hackerrank;

import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        /* Enter your code here. Print output to STDOUT. */

        int a= A.length();
        int b =B.length();
        int len=a+b;

        System.out.println ( A.compareTo(B)  );

        System.out.println(len);


                                    //if ( A.charAt(1) > B.charAt(1)) {    - > wrong case Test
        if (A.compareTo(B)>0) {
            System.out.println("Yes");
        }

        else System.out.println("No");

        A=A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();

        B=B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();

        String s= A+ " " + B;
        System.out.println(s);



    }
}
