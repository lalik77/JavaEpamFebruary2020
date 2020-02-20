package com.homeworks.hackerrank;

import java.util.Scanner;

public class Java1Darray {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n] ;
        for (int i = 0;i<n;i++) {

            int current = scan.nextInt();
            a[i] = current;
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    }

