package com.oca_ocp.oca_ch7_working_inheritance;

class Math {
    public final double secret = 2;
    }

    class CoplexMath extends  Math {

    public final double secret =4;

    }

public class InfinithMath extends CoplexMath {

    public final double  secret = 8;

    public static void main(String[] args) {
        Math math =new InfinithMath();
        System.out.println(math.secret);

    }
}
