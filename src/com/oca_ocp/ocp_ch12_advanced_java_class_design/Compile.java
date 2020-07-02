package com.oca_ocp.ocp_ch12_advanced_java_class_design;

@FunctionalInterface
interface TestLambdas {
    int myTest(int a, int b);
}

public class Compile {

   static TestLambdas t= (int a, int b) -> a+b;

    void myFoo(TestLambdas testLambdas,int a,int b) {

        System.out.println("Result of call myFoo -> " + testLambdas.myTest(a,b));
    }

    public static void main(String[] args) {
        new Compile().myFoo(t,3,5);
    }
}
