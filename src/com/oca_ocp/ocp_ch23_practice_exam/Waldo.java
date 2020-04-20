package com.oca_ocp.ocp_ch23_practice_exam;

/* final */ interface Finder {

    //default long find() { return 20 ; }
    long find();
}

abstract class Wanda {

    abstract long find();
}


final class Waldo extends Wanda implements Finder {

    public long find() { return 40 ; }


    public static void main(String[] pictures) {

        final Finder f = new Waldo();
        System.out.println(f.find());

    }
}
