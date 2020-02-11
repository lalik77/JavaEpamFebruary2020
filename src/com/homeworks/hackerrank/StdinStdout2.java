package com.homeworks.hackerrank;

import java.util.Scanner;

public class StdinStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =scan.nextDouble();
        scan.nextLine();//TODO посмотреть как точно работает код
        String s = scan.nextLine();

        scan.close();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
