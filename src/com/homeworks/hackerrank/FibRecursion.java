package com.homeworks.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
/* Practical lesson Epam_feb2020 */

// Write method for Fibonacci numbers , recursive way
public class FibRecursion {

    static public long fibNaiv(int n,long[] mem) {

        if(n<0) { // Fibonacci ne mojet bit s argumentom menshe 0;

            throw new IllegalArgumentException();
        }

        if(mem[n]!=-1) {
            return mem[n];
        }

        if (n<=1) return n;
        long result = fibNaiv(n-1,mem)+fibNaiv(n-2,mem);
        mem[n]=result;
        return result;
    }

    static public long fibNaiv1(int n) {



        if (n<=1) return n;
        long result = fibNaiv1(n-1)+fibNaiv1(n-2);

        return result;
    }

    static BigInteger[] cache = new BigInteger[1000];

    public static BigInteger fibFast(int n) {

        if(n<0) { // Fibonacci ne mojet bit s argumentom menshe 0;

            throw new IllegalArgumentException();
        }

        if (n<=1) return BigInteger.valueOf(n);

        if(cache[n]!=null) {
            return cache[n];
        }

        BigInteger result = fibFast(n-1).add(fibFast(n-2) );
        cache[n]=result;
         return result;

    }



    public static void main(String[] args) {

        int n=75;
        int m=100;
        long[] mem1 = new long[n+1];
        long[] mem2 = new long[m+1];
        Arrays.fill(mem1,-1);
        Arrays.fill(mem2,-1);

        System.out.println(fibNaiv(n, mem1));
        System.out.println(fibNaiv(m, mem2));

        //System.out.println(fibNaiv1(50));
        System.out.println(fibFast(75));


    }
}
