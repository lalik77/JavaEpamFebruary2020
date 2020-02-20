package com.homeworks.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

    public static void main(String[] args) {

        Scanner scsnner = new Scanner(System.in);


        try { int x = scsnner.nextInt();
              int y = scsnner.nextInt();
              int div=x/y;
            System.out.println(div);

        }catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
         catch (ArithmeticException e) {
             System.out.println("java.lang.ArithmeticException: / by zero");
         }
    }
}
