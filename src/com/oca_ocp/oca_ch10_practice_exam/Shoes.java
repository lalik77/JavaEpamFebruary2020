package com.oca_ocp.oca_ch10_practice_exam;


/*Q64 */
public class Shoes {

    static String shoes1 = new String("sandal");
    static String shoes2 = new String("flip flop");

    public static void shopping(){
        String shoes3 = new String("croc");
        shoes2 = shoes1;
        shoes1 = shoes3;

    }

    public static void main(String[] args) {
        shopping();
        System.out.println(shoes1);
        System.out.println(shoes2);
    }
}
