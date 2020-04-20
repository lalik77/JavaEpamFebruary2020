package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Q7

public class TpsReport {

    public void submitReports() throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();
        Future bosses = service.submit( ()-> System.out.println("hello") );
        service.shutdown();
        System.out.println(bosses.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new TpsReport().submitReports();
    }
}
