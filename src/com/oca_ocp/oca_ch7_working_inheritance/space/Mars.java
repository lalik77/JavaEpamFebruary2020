package com.oca_ocp.oca_ch7_working_inheritance.space;


interface Sphere {

    default String getName() {return "Unknown";}
}
abstract class Planet {

    abstract String getName();
}

public class Mars extends Planet implements Sphere {

    public Mars() {super();}

    public String getName() { return "Mars";}

    // public static void main(Final String[] probe) { // error
     public static void main(final String[] args) {
         System.out.println(((Planet) new Mars()).getName());// => Mars

         Object o = new Mars();

     }
}
