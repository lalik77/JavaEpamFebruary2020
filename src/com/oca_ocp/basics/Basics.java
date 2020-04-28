
// import java.lang.Math;

package com.oca_ocp.basics;


import java.util.Optional;

public class Basics {

    /*1*/

//    public void main(String[] args) // not valid for entru declaratio
//    public static void main () // not valid for entru declaratio
//    private static void start ( String [] mydata){}; // not valid for entru declaratio


    
    static void process(){

        int a=1, b=3,c=1,d=0;
        c=a-++b;
        d=c-b++;

        System.out.println(c+" "+d + " " + b);

    }

    public static final void main(String[] mydata) {

        System.out.println("Hello");
        process();

}



}
