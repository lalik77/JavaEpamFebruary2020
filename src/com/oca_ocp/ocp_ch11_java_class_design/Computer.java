package com.oca_ocp.ocp_ch11_java_class_design;



public class Computer {
    String type = "Computer";

    static Computer computer = new Laptop();
    static Laptop laptop = new Laptop();

    public static void main(String[] args) {

        System.out.println(computer.type + " , " + laptop.type);

    }
}

class Laptop extends Computer {
    String type = "Laptop";



}