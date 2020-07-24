package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Riddle {

    public void sleep() {

        try {
            Thread.sleep(5000);
        }catch (Exception e) {}
    }

    public String getQuestion (Riddle r) {
        synchronized (this) {

            sleep();
            if(r!=null) r.getAnswer(null);

            return "getQuestion";
        }


    }

    public synchronized  String getAnswer(Riddle r) {
        sleep();
        if(r!=null) r.getAnswer(null);
        return "getAnswer";
    }

    public static void main(String[] args) {
        final Riddle r1 = new Riddle();
        final Riddle r2 = new Riddle();

        ExecutorService s = Executors.newFixedThreadPool(2);
        s.submit(()->r1.getQuestion(r2));
        s.execute(()->r2.getAnswer(r1));
        s.shutdown();
    }
}
