package com.oca_ocp.oca_ch10_practice_exam;

public class CrossWord {

    private static int[] crossword [] = new int[10][20];

    public static void main(String[] args) {

       //  System.out.println(crossword.length); // -> 10
       // System.out.println(crossword[0].length);

        for ( int i =0 ; i < crossword.length ; i++ )
            for (int j=0 ; j < crossword.length ; j++ ) {

            crossword[i][j] = 'x';

            }

            getValues(crossword);


    }

    public static void getValues(int[][] crossword) {

        for (int i=0 ; i<crossword.length ; i ++ )
            for (int j=0 ; j<crossword[i].length ; j++) {

                System.out.print(crossword[i][j] + " " );
            }


    }




}
