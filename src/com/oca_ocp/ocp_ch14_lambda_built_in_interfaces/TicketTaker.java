package com.oca_ocp.ocp_ch14_lambda_built_in_interfaces;

import java.util.function.IntUnaryOperator;

public class TicketTaker {

    private static int AT_CAPACITY = 100 ;
    public int takeTicket (int currentCount , IntUnaryOperator /*<Integer> */ counter) {

        return counter.applyAsInt(currentCount);
    }

    public static void main(String... theater) {

        final TicketTaker bob = new TicketTaker();
        final int oldCount = 50 ;

        final int newCount = bob.takeTicket(oldCount,
                   t->{

            if(t>AT_CAPACITY) throw new RuntimeException("Reached");
            return t+1;


                   });

        System.out.println(newCount);


    }
}
