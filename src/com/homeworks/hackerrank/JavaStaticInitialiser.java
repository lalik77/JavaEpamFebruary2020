package com.homeworks.hackerrank;

import java.util.Scanner;

/**

 @author   Mami Alex

 **/

public class JavaStaticInitialiser {

    private static boolean flag=true; // Without initialisation to true in  main() method -> flag=false at begining
    private static int H; // must have been declared outside of block static {}
    private static int B; //  must have been declared outside of block static {}
    static {

        Scanner in = new Scanner (System.in);
        B=in.nextInt();
        H=in.nextInt();
        in.close();

        if (H<=0 || B<=0) {
            flag=false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if(flag) {

            int area = B*H;
            System.out.print(area);
        }
    }
}
