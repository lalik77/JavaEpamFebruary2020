package com.oca_ocp.basics;


/*Q 21 */
public class Tolls {

    private static int yesterday = 1 ;
    int tomorrow = 10;

    @Override
    public String toString() {
        return " "+ tomorrow;
    }

    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today=20,tomorrow=40;
        System.out.println((today + tolls.tomorrow + tolls.yesterday));// -> 31
        yesterday=2;
        System.out.println(yesterday);//->2
        Tolls t1=new Tolls();
        Tolls t2=new Tolls();
        t1.tomorrow=15;
        t2.tomorrow=15;
        System.out.println(t1);// com.oca_ocp.basics.Tolls@140e19d -> after override toString
        System.out.println(t2.toString()); // com.oca_ocp.basics.Tolls@140e19d - > after override toString
        System.out.println((t1 instanceof Object)); // ->true
        System.out.println((t1 instanceof Tolls)); // -> true
        // System.out.println(t1 instanceof Integer); compilation error
        System.out.println( t1 == t2 ); // false
        System.out.println( t1.equals(t2)  ); // ********* false *********
        System.out.println(t1.tomorrow == t2.tomorrow);// true
        t2.tomorrow=25;//was 15
        System.out.println(t1.tomorrow == t2.tomorrow);// false
        System.out.println(t2.tomorrow);// 25


        /******************************************************************/
        t2=t1; // одну ссылку присваиваем другой
        System.out.println(  t1 == t2  ); // true
        System.out.println(  t1.equals(t2)  ); //true
        System.out.println(t2.tomorrow); // was 25 -> 15


    }
}
