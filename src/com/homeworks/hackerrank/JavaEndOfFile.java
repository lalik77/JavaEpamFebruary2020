package com.homeworks.hackerrank;

import java.util.Scanner;

/***
 *
 * @author Mami Alex
 Scanner in=new Scanner(System.in);
 String s=in.nextLine();
 while(in.hasNext()) {

 s=in.nextLine();
 System.out.println(s);
 }

 to exit from console ^D  on keyboard ctrl+D
 * */

public class JavaEndOfFile {

    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        int i=1;

        while(in.hasNext()) {

            String s=in.nextLine();
            System.out.println(i+" "+s);
            i++;
        }




    }
}
