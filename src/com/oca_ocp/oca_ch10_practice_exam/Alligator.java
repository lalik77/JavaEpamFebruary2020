package com.oca_ocp.oca_ch10_practice_exam;

public class Alligator {

    static int teeth;
    double scaleToughness;

    public Alligator(){
        teeth++;
    }
    public void snap(int teeth) {
        System.out.println(teeth + " ");
        teeth--;
    }

    public static void main(String[] unused) {

       // System.out.println(new Alligator() + " " + teeth);

        new Alligator().snap(teeth); // 1
        new Alligator().snap(teeth); // 2
        new Alligator().snap(teeth); // 3

    }


}
