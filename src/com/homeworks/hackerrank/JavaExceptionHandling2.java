package com.homeworks.hackerrank;

import java.util.Scanner;


class MyCalculator1 {

    // You have to realise this method() --
    public long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) throw new Exception("n or p should not be <0");

        if (n == 0 && p == 0) throw new Exception("n and p should not == 0");

        else {

            if (p == 0) {
                return 1;
            } else //{
                     // long power = n;
                     //for (int i = 1; i < p; i++) {
                     // power = power * power;
               // }
                return (long)Math.pow(n,p);
            }
        }

}

public class JavaExceptionHandling2 {

    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
