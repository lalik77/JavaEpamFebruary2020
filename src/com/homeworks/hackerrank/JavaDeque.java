package com.homeworks.hackerrank;

import java.util.*;

public class JavaDeque {



    static int maksUnique (int n,int m, int[] arr) {

        HashSet<Integer> set=new HashSet<>();
        Deque deque = new ArrayDeque<>();

        int max=Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            int num=arr[i];
            deque.add(num);
            set.add(num);  // В Set загрузятся уникальные int

           // System.out.print(  "Size  " + deque.size() + " value: " + value+", ");

            System.out.println("i = "+i + " deque-> "+deque.toString() + " deque size " + deque.size());
            System.out.println("i = "+i + " set-> " + set.toString() + " set size " + set.size());

            if (deque.size()== m ) { // Deque size доходит до m ->

                System.out.println("Deque size дошло до m");

                if (set.size() > max ) { // -> условие

                    max = set.size();  // - > подгоняем значение max к  set size -> дальше set size может уменьшатся.
                                       //
                }
                int first = (int)deque.remove(); // при следующих итерациях deque size останется равным m
                System.out.print("i = " + i + " int first " + first+" \n");
                System.out.println("i = "+i + " deque after removing first-> "+deque.toString() + " deque size " + deque.size());

                if(!deque.contains(first)) {
                    System.out.println(" Это условие -> !deque.contains(first) = true ");
                    set.remove(first);
                    System.out.println("Set size =  " + set.size() + " " + set);

                }
            }
        }
//        System.out.println();


        return max;
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //  - 6- number of loops ; so the size of Deque
        int m = in.nextInt(); // 3 - size of subarray with unique integers inside
        int[]arr = new int[n];// - setting an array of integers with length of 6

       // System.out.println("n: " + n + " m: " + m);

        for (int i = 0; i < n; i++) {
            int num = in.nextInt(); //our input from test case on hackerrank -> 5 3 5 2 3 2
            //deque.addFirst(num);
            //deque.add(num);
            arr[i]=num;
            // int maxUnique(int n,int m , Deque deque){ }  // реализвать метод
        }
        in.close();

        System.out.println(maksUnique(n, m, arr));

    }
}


