package com.homeworks.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**

 @ resolved by Mami Alex

 **/

public class JavaList {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int lenList=scanner.nextInt();

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i <lenList ; i++) { // Заполняем целыми числами

            int currentEl=scanner.nextInt();
            list.add(currentEl);

        }

        int queries=scanner.nextInt();


        for (int i = 0; i <queries ; i++) {

            String action = scanner.next();

            if(action.equals("Insert")) {
                int idx=scanner.nextInt();
                int value=scanner.nextInt();
                list.add(idx,value);

            }

            if(action.equals("Delete")) {

                int idx = scanner.nextInt();
                list.remove(idx);
            }

        }

        for ( Integer num: list ) {

            System.out.print(num+" ");

        }

    }
}
