package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class SwitchCase {

    public static void main(String[] args) {
        char grade = 'C';
        int a=0;

        switch (grade) {


            case 'A' :
                System.out.println("very good");
                a++;
            case 'B' :
                System.out.println("not good");
                a++;
            case 'C' :
                System.out.println("Exact");
                a++;
            default:
                System.out.println("default");
                a++;

        }
        System.out.println(a);

    }
}
