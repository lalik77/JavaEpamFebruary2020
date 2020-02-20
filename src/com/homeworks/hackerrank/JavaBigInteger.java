package com.homeworks.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        BigInteger a = new BigInteger(s1);
        String s2=scanner.next();
        BigInteger b = new BigInteger(s2);

        BigInteger sum = a.add(b);
        BigInteger multiple=a.multiply(b);
        System.out.println(sum.toString());
        System.out.println(multiple.toString());



    }
}
