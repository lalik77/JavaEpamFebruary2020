package com.oca_ocp.ocp_ch23_practice_exam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Q2
public class Piday {

    public static void main(String[] args) {
        LocalDateTime pi = LocalDateTime.of(2017,3,14,1,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("m.MMddhh");
        System.out.println(formatter.format(pi));

        /*formatter=DateTimeFormatter.ofPattern("m.dddhhhMMM"); // Too many pattern d
        System.out.println(formatter.format(pi));*/

        /*formatter=DateTimeFormatter.ofPattern("m.ddhhhMMM"); // Too many pattern h
        System.out.println(formatter.format(pi));*/

        /*formatter=DateTimeFormatter.ofPattern("m.ddhhMMMM"); // Too many pattern месяц
        System.out.println(formatter.format(pi));*/

        formatter=DateTimeFormatter.ofPattern("m.ddhhMM");
        System.out.println(formatter.format(pi));
}
}
