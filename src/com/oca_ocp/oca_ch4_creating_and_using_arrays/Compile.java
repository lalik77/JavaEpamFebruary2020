package com.oca_ocp.oca_ch4_creating_and_using_arrays;

import java.util.Arrays;

public class Compile {
    /*Chap 4 Q5 code snippet*/
    static public void printStormName(String...names ) {
        System.out.println(Arrays.toString(names));
    }
    static public void printStormNames(String[] names) {

        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {

        /* Q5 code snippet */
        System.out.println("Q5 code snippet ");

        printStormNames(new String[]{"a","b"});
        printStormName(new String[]{"fr","dz"});
        printStormName("Alex","John");
       // printStormNames("alex"); // error
       // printStormNames("alex","john"); // error

        /*Q10 code snippet */

        System.out.println("Q10 code snippet ");

        String[] nums = new String[] {"1","9","10"};
        String[] myNums = new String[] {"1","8","10","18"};
        Arrays.sort(nums);
        Arrays.sort(myNums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(myNums));
        System.out.println(nums + " " + myNums);


        /*Q17 code snippet */
        System.out.println("Q17 code snippet ");

        String[] os = new String[] {"Mac","Linux","Windows"};
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "Mac"));

        /*Q18 code snippet*/
        System.out.println("Q18 code snippet ");
       // char[][] ticTacToe = new char[3,3];error
        /*Q20 code snippet*/
        //[][]String alpha ;//error
        // [] String beata ; // error
        String [][] gamma;
        String [] delata [];
        String epsilon[][];

        /*Q21 code snippet*/
        System.out.println("Q21 code snippet ");
        char [][] block = new char[][] {{'a','b','c'} ,{'d'} ,{'e','f'} };
        System.out.println(block[0][1]);
        System.out.println(block[1][0]);
        //System.out.println(block[1][1]);//ArrayIndexOutOfBoundsException

        /*Q25 code snippet*/
        System.out.println("Q25 code snippet ");
        String empty = new String();
        System.out.println("empty = " + empty);
        String empty1;
       // System.out.println("empty1 = " + empty1);// error not initilised
        String [] strings = new String[2];
        System.out.println(strings); // [Ljava.lang.String;@14ae5a5
        System.out.println(strings.toString()); //[Ljava.lang.String;@14ae5a5
        System.out.println(Arrays.toString(strings));// [null, null]



        /*Q29 code snippet*/
        System.out.println("Q29 code snippet ");

        String [] operatingSystem = new String[] {"Mac","Linux","Windows"};
        Arrays.sort(operatingSystem);
        System.out.println(Arrays.binarySearch(operatingSystem,"RedHat")); // -3
        System.out.println(Arrays.binarySearch(operatingSystem,"Android"));

        /*Q37 code snippet*/
        System.out.println("Q37 code snippet ");
        char [][] ticTacToe = new char[3][3];
        ticTacToe[0][0] = 'X';
        ticTacToe[1][1] = 'X';
        ticTacToe[2][2] = 'X';
        System.out.println(ticTacToe.length + " in a row");

        /* Q43 code snipped */
        System.out.println("Q43 code snippet ");
        String [][] listing = new String[][] { {"Book"} , {"Game","29.99"} };
        System.out.println( listing.length + " " + listing[0].length); // -> 2 1
        System.out.println( listing.length + " " + listing[1].length); // - > 2 2




    }
}
