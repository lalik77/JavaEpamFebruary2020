package com.homeworks.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        String[] pair_left = new String[t];
        String [] pair_right = new String[t];
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i <t ; i++) {

            pair_left[i]=scanner.next();
            pair_right[i]=scanner.next();

        }

        scanner.close();

        for (int i = 0; i <t ; i++) {

            stringSet.add(pair_left[i]  + " " + pair_right[i]);
            System.out.println( stringSet.size() );

        }




    }
}
