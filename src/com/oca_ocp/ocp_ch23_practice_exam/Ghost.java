package com.oca_ocp.ocp_ch23_practice_exam;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;


// Q21
abstract class Phantom {

    public void bustLater ( DoubleConsumer buster , double value ) {

        buster.accept(value);
    }

}

public class Ghost extends Phantom {

    public void bustNow(Consumer<Double> buster , double value) {

        buster.accept(value);
    }

    void call() {

        double value = 10 ;
        bustNow( System.out::print, value ); // Option A
        bustLater( System.out::print , value ); // Option A


        bustNow(  g -> { System.out.println(); } , value  );  // Option C
        bustLater( g-> { System.out.println() ; } , value  ); // Option C


        bustNow(  v -> { System.out.println(v); } , value  ); // Option E
        bustLater( v-> { System.out.println(v) ; } , value  ); // Option E

        // not compile options

        bustNow(  a -> { System.out.println(a.intValue()); } , value  ); // Option B
        // bustLater( a-> { System.out.println(a.intValue() ) ; } , value  ); // Option B does not compile

       // bustNow(  u -> { System.out.println((long)u); } , value  ); // Option D does not compile
         bustLater( u-> { System.out.println((long)u ) ; } , value  ); // Option D


        //bustNow( w -> System.out::println, value ); // Option F
        //bustLater( w -> System.out::println , value ); // Option F



    }

}
