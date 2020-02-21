package com.oca_ocp.basics;

public class Snippet {

    public static void main(String[] args) {

        String tree = "Pine";
        int count=0;

        if (tree.equals("pine")) {

            int height = 55 ;
            count = count + 1 ;
        }

        //  (height+count); // not available , height declared inside if { } , it's local
    }
}
