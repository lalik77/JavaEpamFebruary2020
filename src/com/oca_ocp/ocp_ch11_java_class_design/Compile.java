package com.oca_ocp.ocp_ch11_java_class_design;

public class Compile {

    static int[][] game;

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3};
        int[] array2 = new int[]{3};




        for (int i=0 ; i<array1.length ; i++ ) {

            array2[i]=array1[i];
        }

        System.out.println(array2[2]);
    }
}
