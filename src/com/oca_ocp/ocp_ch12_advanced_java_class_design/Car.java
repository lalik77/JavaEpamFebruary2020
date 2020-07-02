package com.oca_ocp.ocp_ch12_advanced_java_class_design;

interface Drive{
    int SPEED = 5 ;
    default int getSpeed() { return SPEED;}

}
interface Hover{
    int MAX_SPEED = 5;
    default int getSpeed() { return MAX_SPEED;}
}
public class Car implements Drive,Hover {
    @Override // if comment this override getSpeed() will not compile
    public int getSpeed() {
        return 10;
    }

    public static void main(String[] args) {

        class RaceCar extends Car {
            @Override
            public int getSpeed() {
                return 20;
            }
        }

        System.out.println(new Car().getSpeed());
        System.out.println(new RaceCar().getSpeed());


    }
}
