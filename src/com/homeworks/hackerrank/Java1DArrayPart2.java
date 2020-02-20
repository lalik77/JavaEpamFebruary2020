package com.homeworks.hackerrank;

import java.util.Scanner;

public class Java1DArrayPart2 {


    public static boolean canWin(int leap, int[] game) {

         return isSolvable (leap,game,0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {

        //Base - База
        if ( i>=game.length )
            return true; // Получается дойти до конца
        else if (i<0 || game[i]==1) {

            return false;
        }

        game[i]=1;// marks as visited - пометить как отмеченным

        //Рекрсивный вызов

        return  isSolvable(leap,game,i+leap)
             || isSolvable(leap,game,i+1)
             || isSolvable(leap,game,i-1)
                ;


    }

    public static void main(String[] args) {

   /*

   Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();

        */
       // int[] array1 = {0,0,0,0,0};//Test 1
       // System.out.println((canWin(3, array1)) ? "YES" : "NO"); // Expected Yes

        int[] array2 = {0,0,0,1,1,1};//Test 2

       System.out.println((canWin(5, array2)) ? "YES" : "NO"); // Expected Yes


        //int[] array3 = {0,0,1,1,1,0};//Test 3

        //System.out.println((canWin(3, array3)) ? "YES" : "NO");

       //int[] array4 = {0,1,0};//Test 4

        //System.out.println((canWin(1, array4)) ? "YES" : "NO");

       // int[] array5 = {0,1,0,1,0,1};//Test 5

       // System.out.println((canWin(2, array5)) ? "YES" : "NO"); // expected yes



      //  int[] array6 = {0,0,1,1,0,0,1,1,0,0};//Test 6

      //  System.out.println((canWin(6, array6)) ? "YES" : "NO"); // expected No







    }


}
