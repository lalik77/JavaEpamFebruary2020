package com.oca_ocp.basics;

public class Compile {

    static boolean a;
    boolean b;

    static int i;

    void process() { b=true;}

    static Object object = new Object();



    public static void main(String[] args) {

        System.out.println(a);
        float[] lion = new float[]{};
        //System.out.println(b);

        object = a;
        System.out.println(a);

        i=(Integer) object;

        System.out.println(i);

    }



}
