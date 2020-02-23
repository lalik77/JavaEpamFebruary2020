package com.oca_ocp.java_data;

import javax.sound.midi.Soundbank;

public class Compile {

    /*  This bloc will not compile because of value : int -> primitive
    ********************************************************************
    public String convert_1 (int value) {

        return value.toString(); // toString cannot be called from primitive
    }
    **************************************************************************
    */

    public String convert_2 (Integer value ) {

        return value.toString();
    }

    public String convert_3 (Object value) {
        return value.toString();

    }

    /* Q11  */

    double d1=5f;
    double d2 = 5.0;
    float f1=5f;
    //float f2 = 5.0; // incompatible types ,requiered float , found double;without suffix f does not compile
    float f3 = 5.0f;

    /*Q25 local variable type String*/

    public static void print() {

        String str;
        Link link;
        Link link5 = new Link("link",null);
       // System.out.println(str); // str have to be initilized
        //System.out.println(link); // lnk have to be initilized
        System.out.println(link5);
    }

      {
        Integer integer=new Integer(127);
        System.out.println("byteValue method "+integer.byteValue());//->4

        System.out.println(integer.valueOf(integer).getClass());// class java.lang.Integer

       }

       static  {

         String cat = "cat" , dog = " dog";
           System.out.println(cat +" " + dog); // static init first

       }

    public static void main(String[] args) {
        print();
        Compile compile=new Compile();
    }

}
