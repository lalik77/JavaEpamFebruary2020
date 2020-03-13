package com.oca_ocp.oca_ch9_working_selected_classes_java_api;

/* Q46 code snippet */

public class StringVsStringBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("54321");

        String string="string";

        /*replace() method for Substring */
        /*передаем  String в качестве параметра */
        // System.out.println(builder.replace(1, 3, string));
        System.out.println(builder); // -> 53421
        builder.replace(1, 3, string);// 5string21
        System.out.println(builder);

        /*передаем  StringBuilder в качестве параметра*/

        StringBuilder builder1 = new StringBuilder("43");
       //  builder.replace(1,3, builder1); // for StringBuilder error

        /*передаем  char в качестве параметра*/

        // builder.replace(1,2,'a'); // for StringBuilder error

        System.out.println("***----- Method repalce() for String class -------***");

        /*replace() method for String*/
        /*передаем  String в качестве параметра */

        String s1="12";

        System.out.println(string); // -> string

        System.out.println( string.replace(string,s1) ); // -> string replaced by 12
        /*передаем  StringBuilder в качестве параметра */
        System.out.println( string.replace(string,builder1) ); // -> string replaced by 43 (value of builder1)
        /*передаем  char в качестве параметра */
        System.out.println(string.replace('s','4')); //

        /*String не поменялся */
        System.out.println(string);



    }
}
