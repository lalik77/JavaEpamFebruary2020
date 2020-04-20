package com.oca_ocp.ocp_ch17_use_java8_date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Compile {

    public static void main(String[] args) {
        //Q6 code snippet
        System.out.println("Q6 code snippet!");
        int year = 1874 ;
        int month = 3;
        //int month = Month.MARCH;
       // System.out.println(Month.MARCH);
        int day= 24;
       // LocalDate date = LocalDate.of(year,month,day);
       // System.out.println(MyMonth.Fevri);

        LocalDate date = LocalDate.of(year,month,day);
        System.out.println(date.isBefore(LocalDate.now()));

        System.out.println("Q7 code snippet!");
        LocalDate hatDay  = LocalDate.of(2017,Month.JANUARY,15);
        DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
        System.out.println(f.format(hatDay));
        System.out.println(hatDay.format(f));

        System.out.println("Q9 code snippet!");
        LocalDate localDate =LocalDate.of(2017,3,12);
        LocalTime localTime=LocalTime.of(3,0); // hour 2 , minute 0 -> both compile
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime z = ZonedDateTime.of(localDate,localTime,zone);
        System.out.println(z);


    }


}

enum MyMonth {

    Janvi,
    Fevri;
}
