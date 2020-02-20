package com.homeworks.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {


    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String n = scanner.nextLine();


        scanner.close();


        BigInteger bigInteger=new BigInteger(n);
        if (bigInteger.isProbablePrime(1)) {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
