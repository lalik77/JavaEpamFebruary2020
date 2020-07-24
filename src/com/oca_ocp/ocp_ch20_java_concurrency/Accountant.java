package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//Q27
public class Accountant {

    public static void completePaperwork() {
        System.out.println("F");
    }

    public static double getPi() {
        return 3.14;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService x = Executors.newSingleThreadExecutor();
        Future<?> f1 = x.submit(()->completePaperwork());
        Future<Object> f2 = x.submit(()->getPi());
        System.out.println(f1.get() + " " + f2.get() );
        x.shutdown();
    }
}
