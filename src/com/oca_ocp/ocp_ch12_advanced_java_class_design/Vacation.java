package com.oca_ocp.ocp_ch12_advanced_java_class_design;

enum DaysOff{

    Thanksgiving,
    PresidentsDay,
    ValentinesDay
}

public class Vacation {

    public static void main(String[] args) {

        final DaysOff input = DaysOff.Thanksgiving;

        switch (input) {


            default :
            case ValentinesDay:  //   error  DaysOff.PresidentsDay

                System.out.println("1");
            case PresidentsDay: //  error DaysOff.ValentinesDay
                System.out.println("2");

        }

    }
}
