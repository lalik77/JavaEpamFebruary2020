package com.oca_ocp.oca_ch3_operators_decision_constructs;

public class ThePlan {

    public static void main(String[] input) {

        int plan = 1 ;
        plan = plan++ + --plan;
        if(plan==1){
            System.out.println("Plan  A");
        }else {
            if (plan == 2) System.out.println("Plan B");

        }  //else  error

        int my_plan = 1 ;
        my_plan = my_plan++ + --my_plan;
        System.out.println("my_plan = " + my_plan);

    }

}
