package com.oca_ocp.oca_ch10_practice_exam;



public class Listing {

    public static void main(String[] args) {
        String [][] listing = new String[][] {  {"Book","34.99"} , {"Book","34.99","uy"} , {"Book","34.99"} } ;

        System.out.println(listing.length); // 3
        System.out.println(listing[1].length);//3
        System.out.println(listing[0].length); // 2
    }
}
