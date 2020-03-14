package com.oca_ocp.ocp_ch15_java_stream_api;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/* from youtube уроки Java , Java8 P4 Streams */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        /*1 st way*/
        for ( String s:list   ) {
            System.out.println(s);
        }
        System.out.println("***********************");
        /*2nd way*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*3rd with streams and lambda's*/
        System.out.println("***********************");
        Stream<String> stream = list.stream();
        stream.forEach(x-> System.out.println(x));
        //list.stream().peek(x-> System.out.println("\n"+x)).findFirst();
        list.stream().forEach(x-> System.out.println("\n"+x));



    }
}
