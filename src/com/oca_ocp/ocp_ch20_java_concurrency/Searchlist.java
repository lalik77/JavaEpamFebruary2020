package com.oca_ocp.ocp_ch20_java_concurrency;

import java.util.Arrays;
import java.util.List;
//Q39
public class Searchlist<T> {
    private List<T> data;
    private boolean foundmatch = false;
    public Searchlist(List<T> list) {
        this.data=list;
    }

    public void exists (T value,int start , int end) {

        if (end-start<=1) {
            foundmatch = foundmatch || value.equals(data.get(start));
        }else {
            final int middle = start + (end-start)/2;

            class Mythread1 extends Thread{

                public void run() {exists(value,start,middle);}
            }
            class Mythread2 extends Thread{
                public void run() { exists(value,middle,end) ;}
            }

            Mythread1 mythread1=new Mythread1();
            Mythread2 mythread2=new Mythread2();
            mythread1.start();
            mythread2.start();
            //new Thread( ()-> exists(value,start,middle) ).run();
           // new Thread( ()->exists(value,middle,end) ).run();
        }


    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,6);
        Searchlist<Integer> t = new Searchlist<Integer>(data);
        t.exists(5,0,data.size());
        System.out.println(t.foundmatch);
    }

}
