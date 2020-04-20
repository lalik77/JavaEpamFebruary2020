package lesson200407;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;

public class MyDateTime {

    static Instant instant = Instant.now();
    static LocalDateTime ldt=LocalDateTime.now();

    static Duration duration = Duration.ofDays(1);
    static  Period period = Period.ofDays(1);

    public static void main(String[] args) {
        System.out.println(instant);
        System.out.println(ldt);
        System.out.println("--------");

       // System.out.println(duration);
        //System.out.println(period);
        System.out.println(duration.toString());
        System.out.println(period.toString());


    }
}
