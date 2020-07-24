package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
//Q33
public class Compile {

    static List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3));

    public static void main(String[] args) {

       /* List<Integer> copy1 = new ArrayList<>(original);
        for (Integer q : copy1) copy1.add(1);*/

        /*List<Integer> copy4 = Collections.synchronizedList(original);
        for(Integer q : copy4) copy4.add(4);*/

       /* List<Integer> copy2 = new CopyOnWriteArrayList<>(original);
        for(Integer q : copy2) copy2.add(2);*/

        Deque<Integer> copy3 = new ConcurrentLinkedDeque<>(original);
        for(Integer q:copy3) copy3.offer(3);
    }


}
