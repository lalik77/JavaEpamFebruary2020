package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

abstract class A {}

public class Fun extends RecursiveTask {

    final int value;
    public Fun(int value) {
        this.value=value;
    }

    @Override
    protected Integer compute() {
        if(value<1) {
            return 1;
        }

        final Fun f1 = new Fun(value-1);
        final Fun f2 = new Fun(value-2);
        return f1.compute()*f2.compute();
    }

    public static void main(String[] args) {


        ForkJoinPool pool = new ForkJoinPool();

        System.out.println(pool.invoke(new Fun(10)));
        pool.shutdown();
    }
}
