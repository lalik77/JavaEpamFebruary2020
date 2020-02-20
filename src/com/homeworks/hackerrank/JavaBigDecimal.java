package com.homeworks.hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String[]s=new String[n+2];
        for (int i=0;i<n;i++) {
            s[i]=scanner.next();
        }
        scanner.close();


       /*

       // Не проходит все test case
       // при вводе .12 на выходе 0.12
       // при вводе 0 и 0.00000 , воспринимает 0.00000 < 0
       // прийдется реализовать через comparator
       BigDecimal[] bigDecimal=new BigDecimal[n];
        for (int i = 0; i <n ; i++) {

            bigDecimal[i]=new BigDecimal(s[i]);
            bigDecimal[i].setScale(3, RoundingMode.CEILING);

        }

        Arrays.sort(bigDecimal);

        for (int i = 0,j=n-1; i<n ; i++,j--) {
            s[i]=bigDecimal[j].toString();
            }


           */

       /* Реализацию через comparator */

        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);

                //return a.compareTo(b);//ascending order
                return b.compareTo(a);//ascending order
            }
        }; // do not forget ;

        Arrays.sort(s,0,n,myComparator); // myComparator



              //output
        for (int i = 0; i <n ; i++) {
            System.out.println(s[i]);

        }


    }









    }

