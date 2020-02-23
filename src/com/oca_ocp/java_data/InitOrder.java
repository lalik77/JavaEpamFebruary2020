package com.oca_ocp.java_data;

public class InitOrder {

    public String first = "instance";

    public InitOrder() {
        first="constructor";
    }

    { first = "block";  } // with static will not compile

    public void print() {

        System.out.println(first);
    }

    public static void main(String[] args) {
        new InitOrder().print();

    }
}
