package com.oca_ocp.ocp_ch23_practice_exam;


//Q33

import java.util.stream.Stream;

class Blankie {
    String color;
    boolean isPink () {
        return "pink".equals(color);
    }

}
public class PreSchool {

    public static void main(String[] args) {
    Blankie b1 = new Blankie();
    Blankie b2 = new Blankie();

    b1.color = "pink";
    Stream.of(b1,b2).filter(t->t.isPink()).forEach(blankie -> System.out.println(blankie));
   // Stream.of(b1,b2).filter(Blankie::isPink).forEach(System.out::println);

    }
}
