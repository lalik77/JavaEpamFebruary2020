package com.oca_ocp.ocp_ch12_advanced_java_class_design;
//Q40
public class Ready {

    protected static int first = 2;
    private static final short DEFAULT_VALUE = 10;

    private static class GetSet {
        int first =5;
        static int second =DEFAULT_VALUE;
    }

    private GetSet go = new GetSet();

    public static void main(String[] args) {
        Ready r = new Ready();
        System.out.println(r.go.first);
        System.out.println(r.go.second);

    }
}
