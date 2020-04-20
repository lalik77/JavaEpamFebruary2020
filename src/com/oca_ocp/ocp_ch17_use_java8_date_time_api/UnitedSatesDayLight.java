package com.oca_ocp.ocp_ch17_use_java8_date_time_api;


import java.time.*;

// Q5
public class UnitedSatesDayLight {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017,3,12);
        LocalTime localTime = LocalTime.of(1,0);

        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime z = ZonedDateTime.of(localDate,localTime,zone);

       // System.out.println(localDate);
       // System.out.println(localTime);

       // System.out.println(zone);
        System.out.println("ZoneTime"+ z);

        Duration duration = Duration.ofHours(3);
        ZonedDateTime later = z.plus(duration);

        System.out.println(duration);
        System.out.println(later);

        System.out.println(later.getHour());

    }
}
