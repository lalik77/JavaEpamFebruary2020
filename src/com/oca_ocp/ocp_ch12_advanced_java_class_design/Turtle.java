package com.oca_ocp.ocp_ch12_advanced_java_class_design;

abstract interface CanSwim{

    public void swim();
}

public class Turtle {

    public static void main(String[] args) {
        int dis=7;
        CanSwim turtle=new CanSwim() {
            @Override
            public void swim() {

                System.out.println(dis);

            }
        };

        turtle.swim();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
