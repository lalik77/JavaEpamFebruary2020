package com.oca_ocp.oca_ch8_handling_exceptions;

public class Fortress {

    public void openDrawbridge() throws Exception { // p1

        try {
            throw new Exception("Circle");

        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Opening!");
        }finally {
            System.out.println("Walls"); // p2
        }




    }

    public static void main(String[] moat) throws Exception { // if remove throws exception will not compile at p3
        new Fortress().openDrawbridge(); // p3 will not compile
    }
}
