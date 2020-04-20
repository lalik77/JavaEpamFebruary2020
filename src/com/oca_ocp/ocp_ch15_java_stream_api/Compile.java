package com.oca_ocp.ocp_ch15_java_stream_api;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Compile {


    // Q4
    static void basaBall(){

        System.out.println("Q4 code snipped");

        Stream<String> stream = Stream.of("base","ball");
       // stream.map(s->s.length()).forEach(System.out::print);
        System.out.println();
        stream.mapToInt(s->s.length()).forEach(System.out::print);
    }

    // Q5

    static void emptyStream() {

        System.out.println("Q5 code snipped");

        IntStream s =   IntStream.empty();
       //  System.out.println(s);

        IntStream s1 =  IntStream.of(1,2,3,4,5);

       // System.out.println(s.average().getAsDouble());



        //System.out.println(s.average().getAsDouble());


    }

    static void myFoo() { // Q7

        List<Double> list = new ArrayList<>();
        list.add(5.4);
        list.add(1.2);

        System.out.println("Q7 code snippet");
        Optional<Double> opt = list.stream().sorted().findFirst();
        System.out.println(opt.get() + " " + list.get(0));
    }

    static void myFoo9 () { // Q9
        Stream<Character> chars = Stream.of('o','b','s','t','a','c','l','e');
        chars.map(c->c).collect(Collectors.toList());
    }


    static void myFoo8() { // Q8

        System.out.println("Q8 code snippet");

        IntStream stream = IntStream.of(6,10);
        LongStream longs = stream.mapToLong(i->i);
      //  System.out.println(stream.average().getAsDouble()); // will throw IllegalStateException

        System.out.println(longs.average().getAsDouble()); // prints 8->

        LongStream longStream = LongStream.of(8,10);
        System.out.println(longStream.average().getAsDouble()); // prints 18
        IntStream intStream = IntStream.of(8,10);
        System.out.println(intStream.average().getAsDouble()); // prints 18

    }

    static void  myFoo10() {
        System.out.println("Q10 code snippet");

        Map<Integer, Integer> map = new HashMap<>();
        map.put(9, 3);
        // Map<Integer,Integer> result =  map.stream();// does not compile ;
    }



    public static void main(String[] args) {
        basaBall();

        System.out.println("");

        emptyStream();

        myFoo();

        myFoo8();

        //Lesson method reference



        Supplier<Thread> runnable = () -> Thread.currentThread();
        Supplier<Thread> runnable1 = Thread::currentThread;


    }


}
