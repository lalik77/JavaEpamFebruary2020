package com.oca_ocp.ocp_ch12_advanced_java_class_design;

//Q30
interface CanBurrow{
    public abstract void burrow();
}
interface HasHardShell extends CanBurrow{}
abstract  class Tortoise implements HasHardShell{}
public class Desertoise extends Tortoise {
    public int toughness(){return 11;}
    public  void burrow() {
        System.out.println("");
    }
}
