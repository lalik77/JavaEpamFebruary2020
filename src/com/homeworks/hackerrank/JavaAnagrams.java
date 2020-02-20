package com.homeworks.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    /*is Anagram1 -> not pass all test on Hackerrank - with Hello and hello doesn't work
     from youtube https://www.youtube.com/watch?v=Ltdj-wECPw8
     */

    static boolean isAnagram1(String a, String b) {


       // a.replace(" ", "").toLowerCase();
        // b.replace(" ", "").toLowerCase();

        int l1 = a.length();
        int l2 = b.length();
       // int l3 = 26;

        if (l1 != l2) return false;

        int[] charFreq = new int[26];

        for (int i = 0; i < l1; i++) {

            char currentCh = a.toLowerCase().charAt(i);
            int idx = currentCh - 'a';
            charFreq[idx]++;

        }

        for (int i = 0; i < l1; i++) {

            char currentCh = b.toLowerCase().charAt(i); // The reason why it did,n t work on test case for "Hello"
                                                        // java.lang.ArrayIndexOutOfBoundsException: -25
            int idx = currentCh - 'a';
            charFreq[idx]--;


        }

        for (int i = 0; i < 26; i++) {

            if (charFreq[i] != 0) return false;
        }

        return true;

    }

    static boolean isAnagram2 (String a, String b){

        a = a.replace(" ","").toLowerCase();
        b = b.replace(" ","").toLowerCase();

        int l1 = a.length();
        int l2=b.length();

        if (l1!=l2) return false ;

        char[] a_charArray = a.toCharArray();
        char[] b_chararray = b.toCharArray();

        Arrays.sort(a_charArray);
        Arrays.sort(b_chararray);

        for (int i=0;i<l1;i++) {

            if (a_charArray[i]!=b_chararray[i] ) return false;

        }

        return true;
    }






    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();*/
        boolean ret = isAnagram1("Hello", "hello");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );




    }
}
