package com.homeworks.hackerrank;

import static java.lang.System.in;


class Prime {

    static boolean isPrime(int n){

        if(n<2)  return false;
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    void checkPrime(int... numbers){

        for(int n:numbers) {

            if(isPrime(n)) System.out.println(n + " is prime ");
        }
    }




}


public class PrimeChecker {

    public static void main(String[] args) {

        Prime ob1=new Prime();
        ob1.checkPrime(2,5,8,9,10,27,92,87,5);

    }




}
