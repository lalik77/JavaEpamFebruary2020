package com.homeworks.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.util.Stack;

public class JavaTextEditor {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String append = null;
            int show = 0;
            int del = 0;
            String inp = br.readLine();
            String arr[] = inp.split(" ");
            int opt = Integer.parseInt(arr[0]);
            switch (opt) {
                case 1:
                    append = arr[1];
                    sb.append(append);
                    stack.push("+" + append.length());
                    break;
                case 2:
                    del = Integer.parseInt(arr[1]);
                    String delStr = sb.substring(sb.length() - del, sb.length());
                    sb.delete(sb.length() - del, sb.length());
                    stack.push(delStr);
                    break;
                case 3:
                    show = Integer.parseInt(arr[1]);
                    result.add(sb.charAt(show - 1));
                    break;
                case 4:
                    String lastOp = stack.pop();
                    if(lastOp.charAt(0) == '+') {
                        sb.delete(sb.length() - Integer.parseInt(lastOp.substring(1)), sb.length());
                    }
                    else {
                        sb.append(lastOp);
                    }
            }
        }
        try {
            for(Character j:result)
                System.out.println(j);
        } catch (Exception e) {

        }
    }

}
