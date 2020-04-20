package com.oca_ocp.ocp_ch23_practice_exam;

import java.util.OptionalInt;
import java.util.stream.Stream;

//Q19
class Runner {

    private int numberMinutes ;
    public Runner(int n) { numberMinutes = n ; }
    public int getNumberMinutes() { return numberMinutes;}
}

public class Marathon {

    public static void main(String[] args) {
        Stream<Runner> runners = Stream.of(new Runner(183), new Runner(161),new Runner(201));

      /*  OptionalInt opt = runners
                .mapToInt(Runner::getNumberMinutes)
                .peek(System.out::println)
                .max();//Option B */


       //System.out.println(opt);

       /*  OptionalInt opt1 = runners
                .map(Runner::getNumberMinutes)
                .peek(System.out::println)
                .max();//Option A requires Comparator  */

        System.out.println("Option C");


        /* OptionalInt opt2 = runners

                .peek(System.out::println)
                .mapToInt(Runner::getNumberMinutes).max();//Option C */

        OptionalInt opt = runners

                .peek(System.out::println)
                .mapToInt(Runner::getNumberMinutes).max();//Option D same that B
    }

}
