package com.oca_ocp.oca_ch7_working_inheritance;

/* Q31 */

abstract class  Parallelogram {
    private int getEqualSides() { return 0;}
    //public static int getEqualSides() {return 2;}
}

abstract class Rectangle extends Parallelogram {
    public static int getEqualSides() {return 2;}
}
public final class Square extends Rectangle {

    public static  int getEqualSides() {return 4;} // si j enleve le mot cle static will not compile


}
