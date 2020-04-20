package com.oca_ocp.oca_ch10_practice_exam;

interface Plant {
    //default String grow(){return "Grow!";}
}
interface Living{
    public default String grow() { return "Growing!";}

}


public class Tree implements Plant,Living {

    public String grow(int height) {return "Super growing!";}

    public static void main( String[] leaves ){
        Plant p = new Tree();
        System.out.println( ( (Living) p).grow() );


    }
}
