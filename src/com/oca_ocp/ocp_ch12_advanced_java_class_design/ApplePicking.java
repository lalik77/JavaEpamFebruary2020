package com.oca_ocp.ocp_ch12_advanced_java_class_design;

interface Edible { void eat();}
public class ApplePicking {

    public static void main(String[] args) {
        Edible apple = new Edible() {
            @Override
             public void eat() {
                System.out.println("Eat");
            }
        }

        ;
    }
}
