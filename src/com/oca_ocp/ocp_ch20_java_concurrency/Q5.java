package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q5 {

   static List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    static Thread thread1 = new Thread(() -> {
        List<Integer> copy1 = new CopyOnWriteArrayList<>(original);
        for ( Integer w : copy1 )
            copy1.remove(w);
    });

    static  Thread thread2 = new Thread(() -> {
        List<Integer> copy2 = Collections.synchronizedList(original);
        for ( Integer w : copy2 )
            copy2.remove(w);
    });

    static  Thread  thread3 = new Thread(() -> {
        List<Integer> copy3 = new ArrayList<>(original);
        for ( Integer w : copy3 )
            copy3.remove(w);
    });

    static Thread thread4 = new Thread(() -> {
        Queue<Integer> copy4 = new ConcurrentLinkedDeque<>(original);
        for ( Integer w : copy4 )
            copy4.remove(w);
    });


    public static void main(String[] args) {

        thread1.start();
      //  thread2.start();
        //thread3.start();
        thread4.start();



    }

}
