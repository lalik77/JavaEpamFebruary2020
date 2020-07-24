package com.oca_ocp.ocp_ch13_generics_and_collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Magazine implements Comparable<Magazine> {

    private String name ;
    public Magazine(String name) {
        this.name=name;
    }



   @Override
    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }

    public String toString() {
        return name;
    }
}

public class Newstand {

    public static void main(String[] args) {
        Set<Magazine> set = new TreeSet<>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        set.add(new Magazine("zelda"));
        System.out.println(set.iterator().next());
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
