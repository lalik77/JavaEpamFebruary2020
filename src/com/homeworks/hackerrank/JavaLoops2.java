package com.homeworks.hackerrank;

/**

 @ resolved by Mami Alex

   **/
import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // Number of queries


        for (int i = 0; i < t; i++) {


            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;


            for (int j = 0; j < n; ++j) {

                result += a + (int) Math.pow(2, j) * b;
                int f = result - (a * j); // like fibonacci algorithm


                System.out.print(f + " ");

            }
            System.out.print("\n");

        }

        in.close();
    }
}



