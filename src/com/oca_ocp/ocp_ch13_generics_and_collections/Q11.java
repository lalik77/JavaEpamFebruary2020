package com.oca_ocp.ocp_ch13_generics_and_collections;

import java.util.ArrayDeque;

public class Q11 {

    static ArrayDeque<Integer> d  = new ArrayDeque <>();



    public static void main(String[] args) {
        d.offer(18);
        d.offer(15);
        d.push(13);
        System.out.println(d.poll()+ " " + d.poll());

    }
}
