package com.oca_ocp.ocp_ch23_practice_exam;


//Q25 snippet
public class Watch {
    private static final short DEFAULT_HOUR = 12;
    private Watch() {
        super();
    }

    int checkHour() {

        assert DEFAULT_HOUR<12;
        return DEFAULT_HOUR;
    }

    public static void main(String... ticks) {

        System.out.println("Q25 code snippet");
        new Watch().checkHour();


    }

}
