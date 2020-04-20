package com.oca_ocp.oca_ch10_practice_exam;

import java.util.Arrays;
import java.util.List;

public class Museums {

    public static void main(String[] args) {
        String[] array = {"Natural History" , "Science" , "Art"};

        List<String>  museums = Arrays.asList(array);
        // museums.remove(2); // adding and remove not allowed will throw a
                                 // runtime exception UnsupportedOperation Exception

       //  museums.add("test"); // runtime error
        museums.set(0,"new value"); // change permitted
        System.out.println(museums);
    }
}
