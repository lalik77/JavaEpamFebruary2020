package com.oca_ocp.oca_ch10_practice_exam;

public class Legos {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1,1);
        System.out.println(sb);


        StringBuilder sb1 = new StringBuilder("abcdefghijk");
        sb1.delete(1,2);
        System.out.println(sb1);
    }
}
