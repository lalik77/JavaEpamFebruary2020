package com.homeworks.hackerrank;

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.ArrayList;
import java.util.List;

public class JavaDynamicArray {


    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer=0;

        List < List <Integer > > seqList = new ArrayList<>();

        List<Integer> resultList = new ArrayList<>();

        for (int i=0 ; i< n ; i ++ ) {
            seqList.add( new ArrayList<Integer>() );
        }

        for (int i = 0 ; i < queries.size() ; i ++ ) {

            List<Integer> q = queries.get(i);

            if( q.get(0) == 1 ) {

                seqList.get( ( q.get(1) ^ lastAnswer ) % n  ). add ( q.get (2) );
            } else {

                List<Integer> seq = seqList.get( ( q.get(1) ^ lastAnswer ) %n );
                lastAnswer = seq.get( q.get( 2 ) % seq.size() );
                resultList.add(lastAnswer);
            }


        }

        return resultList;



        // Write your code herer

    }

    public static void main(String[] args) {

        /*Напоминание побитовый оператор  XOR*/
        // 0^0 = 0 , 1^1 = 0 , 0^1 = 1 , 1^0 = 1

        int a=5; //101
        int b=6; //110
        // 3 <-  //011
        Byte c=0b011;

        System.out.println(a^b);//-> 3  =>011
        //System.out.println(Integer.toBinaryString(a) + " " + Integer.toBinaryString(b) );
        //System.out.println(Integer.toBinaryString(3));
        System.out.println(c.intValue());

        /* Второй пример */

        a=1; //10000000
        b=7; //11100000
       //6 <-//011000000


        System.out.println(Integer.toBinaryString(a) + " " + Integer.toBinaryString(b) );
        System.out.println(a^b);//-> 6
        c=0b0110; // 6
        System.out.println(c.intValue());
    }
}
