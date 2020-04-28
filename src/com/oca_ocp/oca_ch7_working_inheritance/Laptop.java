package com.oca_ocp.oca_ch7_working_inheritance;

class Computer {

    protected /*final */ int process() { return 5;}

    final int secret = 5;



}

public class Laptop extends Computer {

    public final int process() {return 3 ;}

    final int secret = 3;

    public static void main(String[] chips) {

        //System.out.println(new Laptop().process());

        Computer laptop = new Laptop();
        System.out.println("call method - " + laptop.process() +"  "+ laptop.secret);

        Computer computer = new Computer();
        System.out.println("call method - "+ computer.process() + "  " + computer.secret);

    }




}
