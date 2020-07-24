package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//Q38
public class Bank {

    static int cookies=0;

    public synchronized void deposit(int amount) {
        cookies+=amount;
    }
    public static synchronized void withdrawal(int amount) {
        cookies-=amount;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService teller = Executors.newScheduledThreadPool(100);
        Bank bank=new Bank();
        for(int i=0 ; i<50 ; i++) {

            teller.submit(()->bank.deposit(5));
            teller.submit(()->bank.withdrawal(5));
        }
        teller.shutdown();
        teller.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(bank.cookies);
    }
}
