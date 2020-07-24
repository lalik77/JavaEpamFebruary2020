package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
//Q32
public class Line {

    static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();

    public static void main(String[] args) throws Exception {

        IntStream.iterate(1,i->i+1)
                .limit(5)
                .parallel()
                .forEach( s -> {
                    try {
                        queue.offerLast(s,1000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }) ;

        IntStream.iterate(1,i->5)
                .limit(10)
                .parallel()
                .forEach(s-> {
                    try {
                        queue.pollFirst(10,TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        System.out.println(queue.size());
    }
}
