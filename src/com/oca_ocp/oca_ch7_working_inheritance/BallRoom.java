package com.oca_ocp.oca_ch7_working_inheritance;

abstract class House {

    protected abstract Object getSpace ();

}

abstract  class Room extends House {

    abstract Object getSpace (Object list);


}
abstract public class BallRoom extends House {

    protected abstract Object getSpace();

    public static void main(String[] squareFootage) {

        System.out.println("Let's start the party");

    }
}
