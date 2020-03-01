package com.oca_ocp.oca_ch4_creating_and_using_arrays.counting;

import java.util.Arrays;


/**
  Компиляция
 E:\Dropbox\Уроки\Java\JavaEpamFebruary2020>javac -d out src/com/oca_ocp/oca_ch4_creating_and_using_arrays/counting/Binary.java

 Запуск
 E:\Dropbox\Уроки\Java\JavaEpamFebruary2020>java -classpath ./out/ com.oca_ocp.oca_ch4_creating_and_using_arrays.counting.Binary
 []


 * **/

public class Binary {
   // public static void main(String... args) {
    public static final void main(String [] args) {
        Arrays.sort(args);
        System.out.println(Arrays.toString(args)); // -> []
    }
}
