package com.oca_ocp.oca_ch8_handling_exceptions;

class A {}
class B extends A {}
class C extends A {}

//ClassCastException
public class CCE {
    public static void main(String[] args) {

        Object oA = new A();
        Object oB = new B();
        Object oC= new C();
        
        /*Object a = new A();
        final A data_A = (B)a;
        System.out.println("data = " + data_A);*/

        Object c = new C();
        //final B data_B = (B)c;
        //System.out.println("data_B = " + data_B);
        final A data_A = (A)c;
        System.out.println("data_A = " + data_A);


    }
}
