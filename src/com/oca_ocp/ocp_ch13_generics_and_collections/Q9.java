package com.oca_ocp.ocp_ch13_generics_and_collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Q9 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(56);
        list.add(3);

        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.print(set.size());
        System.out.println(" ");
        System.out.println(set.iterator().next());
    }

}
