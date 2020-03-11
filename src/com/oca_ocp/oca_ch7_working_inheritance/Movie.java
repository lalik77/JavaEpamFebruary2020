package com.oca_ocp.oca_ch7_working_inheritance;

class Cinema {

    private String name;
    public Cinema (){} // without explicit no-arg constructor the sub class constructor will not compile

    public Cinema(String name) { this.name = name ;}
}

public class Movie extends Cinema {


    public Movie(String movie){}

    public static void main(String[] args) {
        // System.out.println( new Movie("Another Trilogy").name ); // no access to var with private access in parent class
        //( new Movie("Another Trilogy").name )
    }



}
