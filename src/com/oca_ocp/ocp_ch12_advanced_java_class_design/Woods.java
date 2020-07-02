package com.oca_ocp.ocp_ch12_advanced_java_class_design;

public class Woods {

    static class Tree {}

    public static void main(String[] args) {
        int w = 100*2;
        final  class Oak extends Tree {

            public int getwater () {
                return w;
            }
        }

        System.out.println(new Oak().getwater());
    }
}
