package com.oca_ocp.ocp_ch12_advanced_java_class_design;
//Q36
final public class Bottle2 {

    final  private int size = 14;
    final  protected class Insert {

       private final int size = 25 ;
       public final int getSize() {
           return Bottle2.this.size;
       }

    }

    final Insert insert = new Insert();

   final public static void main(String[] args) {

       System.out.println(new Bottle2().insert.getSize());

    }

}
