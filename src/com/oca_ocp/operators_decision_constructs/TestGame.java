package com.oca_ocp.operators_decision_constructs;

public class TestGame {
    public String runTest(boolean spinner,boolean roller) {
        if( spinner = roller ) return "up";
        else return roller ? "down" : "middle ";
    }

    public static void main(String[] args) {
        final TestGame tester = new TestGame();
        System.out.println(tester.runTest(false, true));
    }
}
