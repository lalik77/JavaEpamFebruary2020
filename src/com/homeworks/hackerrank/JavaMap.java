package com.homeworks.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i <n ; i++) {

            String name=scanner.nextLine();
            int phone =scanner.nextInt();
            map.put(name,phone);
            scanner.nextLine();

        }




/*

        for(String key : map.keySet() ) {

            System.out.println("Key" + key);
        }
*/


        while (scanner.hasNext()) {

            String s=scanner.nextLine();

            if (map.containsKey(s)) {
                System.out.println(s+"="+map.get(s));
            }
            else {
                System.out.println("Not found");
            }

        }
    }
}
