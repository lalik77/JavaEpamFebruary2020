package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Dolls {

    public void nested() { nested(2,true); }
    public int nested (int level ,boolean height) { return nested(level); }
    public int nested(int level) {return level+1;}


    public static void main(String[] outOfTheBox) {
        //System.out.println( new Dolls().nested() ); // error

    }
}
