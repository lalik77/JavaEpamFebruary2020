package com.oca_ocp.oca_ch9_working_selected_classes_java_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HowLong {



    public static void main(String[] args) {

        LocalDate newYears = LocalDate.of(2017,1,1);
        Period period = Period.ofDays(1);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        System.out.println(format.format(newYears.minus(period)));

    }
}
