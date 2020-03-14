package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class TicketTaker {

    long ticketsSold;

    final AtomicInteger ticketsTaken;

    public TicketTaker(){

        ticketsSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }

    public void performJob(){

        IntStream.iterate(1,p->p+1)
                 .parallel()
                 .limit(20000)
                 .forEach(i->ticketsTaken.getAndIncrement());

        IntStream.iterate(1,q->q+1)
                 .limit(10000)
                 .parallel()
                 .forEach(i->++ticketsSold);

        System.out.println(ticketsTaken + " " + ticketsSold);
    }

    public static void main(String[] args) {
        new TicketTaker().performJob();
    }


}
