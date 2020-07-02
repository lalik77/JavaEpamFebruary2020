package com.oca_ocp.ocp_ch12_advanced_java_class_design;

public class Forecast {
    public enum Snow {BLIZZARD,SQUALL,FLURRY}

    public static void main(String[] args) {
        System.out.print(Snow.BLIZZARD.ordinal());
        System.out.print(" " + Snow.valueOf("flurry".toUpperCase()).name());
        System.out.print( " " +  Snow.FLURRY.ordinal());
        System.out.print( " " +  Snow.FLURRY);

        //System.out.print(" " + Snow.valueOf("flurrys".toUpperCase()).name());
    }
}
