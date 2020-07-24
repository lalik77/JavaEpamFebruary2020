package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.*;

public class Q15 {



    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable c = new Callable() {
            public Object call() {return 10;}
        };

        ExecutorService s = Executors.newScheduledThreadPool(1);

        for(int i=0 ; i<10 ; i++) {

            Future f = s.submit(c);
            f.get();

        }

        s.shutdown();
        System.out.println("Done!");
    }

}
