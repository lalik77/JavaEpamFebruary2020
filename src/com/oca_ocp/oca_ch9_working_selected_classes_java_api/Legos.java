package com.oca_ocp.oca_ch9_working_selected_classes_java_api;

public class Legos {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        //sb.deleteCharAt( 1 ); // sb.deleteCharAt( 1,2 ); -> does not compile
        sb.delete( 1,2 );
        System.out.println(sb);

    }
}
