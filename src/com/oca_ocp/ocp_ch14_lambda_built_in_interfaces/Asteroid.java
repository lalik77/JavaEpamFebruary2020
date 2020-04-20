package com.oca_ocp.ocp_ch14_lambda_built_in_interfaces;

import java.util.function.BiFunction;

// Q5
public class Asteroid {
    static double res;

    public void mine(BiFunction<Integer,Double,Double> lambda) {

        System.out.println(lambda.apply(2, 3.0));


    }

    public static void main(String[] args) {
        new Asteroid().mine( (s,p)-> s+p  );

        ;
    }
}
