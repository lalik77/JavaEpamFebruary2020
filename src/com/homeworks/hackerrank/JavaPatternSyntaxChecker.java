package com.homeworks.hackerrank;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**

 @ resolved by Mami Alex

 **/

public class JavaPatternSyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {


            try {

                String pattern = in.nextLine();

                try {
                    Pattern p = Pattern.compile(pattern);
                } catch (PatternSyntaxException exception) {
                    System.out.println("Invalid");
                    continue;
                }
                System.out.println("Valid");
            } catch (Exception e) {
                //
            }
            testCases--;

        }

    }


}
