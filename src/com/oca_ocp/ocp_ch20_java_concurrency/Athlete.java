package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//q21
public class Athlete {
    int stroke=0;

    public synchronized void swimming() {
        stroke++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService s = Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();

        for (int i=0;i<1000 ; i++) {
            s.execute( ()->a.swimming());
        }

      //  s.awaitTermination(1,TimeUnit.SECONDS);// with this method we have 1000

        s.shutdown();

        s.awaitTermination(1,TimeUnit.SECONDS);
        System.out.println(a.stroke);
    }
}
