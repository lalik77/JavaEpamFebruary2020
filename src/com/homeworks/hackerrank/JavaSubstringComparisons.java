package com.homeworks.hackerrank;

import java.util.Scanner;

/**

 @author   Mami Alex

 **/


public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String current_sub = s.substring(0,k);
        String smallest = current_sub ;
        String largest = current_sub ;
        int len=s.length();

        for (int i=1; i<len-k+1;i++) {

            current_sub = s.substring(i,i+k); // Linear sort like -> algorithm like bubble sort
            if (current_sub.compareTo(largest) > 0 ) {

                largest = current_sub;
            }
            if (current_sub.compareTo(smallest) < 0 ) {

                smallest = current_sub;
            }

        }



        return smallest + "\n" + largest;
    }

    public static  void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String s=scan.next();
        int k=scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s,k));

    }
}
