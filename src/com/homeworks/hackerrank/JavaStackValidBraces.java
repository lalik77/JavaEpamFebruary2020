package com.homeworks.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class JavaStackValidBraces {
    public static void main(String[] args) {

        // - Scanner ----
       /* Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {

            String input = scanner.next();

            System.out.println(isValidBraces(input));
        }

        scanner.close();*/

       String test1 = "g () { h }";
       System.out.println(isValidBraces(test1));

    }

    private static boolean isValidBraces(String input) {

        Stack<Character> stack=new Stack<>();

        for(char c : input.toCharArray())  {

            switch (c) {

                case '(' : stack.push(')' );
                break;
                case '[' : stack.push( ']' );
                break;
                case '{' : stack.push('}' );
                break;
                case ')' :
                case ']' :
                case '}' :
                    if (stack.size()==0) return false;
                        boolean flagdebug2=stack.pop().charValue()!=c;
                    if (flagdebug2) return false;


            }
        }

         boolean flagdebug =stack.isEmpty();


        //return stack.isEmpty();
        return flagdebug;
    }
}
