package com.oca_ocp.ocp_ch13_generics_and_collections;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Q38
class Wash < T extends Collection> {
    T items;

    public void clean( T items) {
        System.out.println( "Cleaned " + items.size() + " items" );

    }

}

public class LaundryTime {

    public static void main(String[] args) {
        Wash <List> wash = new Wash<List>();
        wash.clean( Arrays.asList("sock","tie") );

    }
}
