package com.homeworks.hackerrank;

import java.util.Scanner;

public class StdinStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //int a=0;
        int [] arr = new int[3];

        for (int i=0;i<3;i++) {
             arr[i] = scan.nextInt();
        }

        for (int i = 0; i <3 ; i++) {

            System.out.println(arr[i]);


        }






    }
}
