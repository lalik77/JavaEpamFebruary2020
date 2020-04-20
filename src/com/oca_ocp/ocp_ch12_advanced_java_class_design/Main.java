package com.oca_ocp.ocp_ch12_advanced_java_class_design;


/**
 * from youtube что такое lambda выражения в Java
 * Java course with Kovalevski

 * **/
@FunctionalInterface
interface Isum { // Functional interface
    public int sum(int a, int b);


}

public class Main {

    public static void main(String[] args) {

        Isum sum= new Isum() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        Isum sum2 = (a,b)->a+b;
    }

}


