package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class FootBall {

    public static Long getScore(Long TimeRemaining) { // Long will not compile

        return 2*TimeRemaining;
    }

    public static void main(String[] args) {

        final long startTime = 2;
        getScore(startTime);
    }
}
