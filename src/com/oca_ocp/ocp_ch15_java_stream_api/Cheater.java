package com.oca_ocp.ocp_ch15_java_stream_api;

import java.util.Arrays;
import java.util.Collection;

public class Cheater {

    int count =0;

    public void sneak(Collection<String> coll) {

        //coll.stream().peek(  r-> {  count++;  System.out.println(r); }  ).findFirst();

        // coll.stream().peek(r-> System.out.println(r)).findFirst();

        coll.stream().peek( System.out::println );

        //coll.stream().peek( System.out::println ).findFirst();




    }

    public static void main(String[] args) {
        Cheater c = new Cheater();
        c.sneak(Arrays.asList("weasel"));
    }
}
