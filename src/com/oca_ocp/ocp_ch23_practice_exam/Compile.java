package com.oca_ocp.ocp_ch23_practice_exam;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compile {

    static Long l = 5L;

    // Q3 valid lambdas

    static void myMethod1( MyFinterface1 myFinterface ){

        System.out.println("hello");
    }

    static void myMethod2( MyFinterface2 myFinterface ) {
        System.out.println("hello");
    }

    static void myMethod3(MyFinterface3 myFinterface ) {
        System.out.println("hello");
    }


    // end Q3 valod lambdas

    //

    static int myFoo1 (IntUnaryOperator unaryOperator) {

        int a=3;
        unaryOperator.applyAsInt(3);
        return a;

    }

    //Q32 code snippet
    static void myFoo32 () {

        System.out.println("Q32 code snippet");

        LocalDate trainDay = LocalDate.of(2017,5,13);
        LocalTime time = LocalTime.of(10,0);
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.of(trainDay,time,zone);
        Instant instant = zdt.toInstant();
        //instant = instant.plus(1, ChronoUnit.YEARS); -> throws exception UnsupportedTemporalTypeException

        /*LocalTime time1 = LocalTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(trainDay,time1,zone);
        Instant instant1 = zdt1.toInstant();
        System.out.println(time1 + " " + zdt1 + " " + instant1);*/


        System.out.println(instant);

    }

    static void myFoo36() {

        System.out.println("Q36 code snippet");
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.offer(18);
        //independently  имеется ввиду один за другим
        /*d.peek();
        d.peek();*/

       /* d.pop();
        d.pop();*/

       // d.remove();
       // d.remove();

    }

    static void myFoo60() {

        System.out.println("Q60code snippet");
        Set<Integer> dice = new TreeSet<>();
        dice.add(6);
        dice.add(4);
        dice.add(6);

        //dice.stream().filter(n->n!=4).forEach(System.out::println).count(); //not compile
        //dice.stream().filter(n->n!=4).forEach(System.out::println);
        dice.stream().filter(n->n!=4).peek(System.out::println).count();

    }

    static void myFoo83() {

        System.out.println("Q83 code snippet");

        Stream<String> s = Stream.of("speak","bark","meow12","growl123");
        Map<Integer,String> map = s.collect(Collectors.toMap(String::length,k->k));

       System.out.println(map.size() + " " + map.get(4));
    }

    public static void main(String[] args) {
        myMethod1( ( ) -> { } ); // it compiles

        myMethod2( (Double adder) -> { // it compiles
            int y;
            System.out.println(adder);
            return adder;
        } );

        myMethod2( dog -> dog  ); // it compiles

        myMethod3( (Long l) -> { Long w=5l; return 5; } );

        // Передаем в myFoo1 наши выражения из 15 вопроса

        myFoo1( v->  { // it compiles
            System.out.println("hello");
            return 2%1;
        });

         // myFoo1(  (Integer w)  -> w.intValue() ); // not compile

        myFoo32();
        myFoo36();
       // myFoo60();
        myFoo83(); // java.lang.IllegalStateException: Duplicate key bark




    }


}

@FunctionalInterface
interface MyFinterface1  {

    void method();

    static void method2(int i) {
        System.out.println("hello");
    }
}

@FunctionalInterface
interface MyFinterface2 <T> {

   T method(Double a);

    default void method2(Double a) {
        System.out.println("hello");
    }
}
@FunctionalInterface
interface MyFinterface3 <T> {

    T  method (Long u);
}