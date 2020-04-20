package com.oca_ocp.oca_ch10_practice_exam;

public class Sudoku {

    static int[][] game = new int[4][4];

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        //obj[3] = 'x';
        obj[3] = 8;

        //System.out.println(game[3][3]);
    }
}
