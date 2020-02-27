package com.oca_ocp.operators_decision_constructs;

public class ThePlan {

    public static void main(String[] input) {

        int plan = 1 ;
        plan = plan++ + --plan;
        if(plan==1){
            System.out.println("Plan  A");
        }else {
            if (plan == 2) System.out.println("Plan B");

        }  //else  error

    }

}
