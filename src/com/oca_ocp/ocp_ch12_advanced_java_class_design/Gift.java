package com.oca_ocp.ocp_ch12_advanced_java_class_design;

//Q38 was on exam
interface Toy {
    String play();
}

public class Gift {
    public static void main(String[] matrix) {

        abstract class Robot {}
        class Transformer extends Robot implements Toy {
            public String name = "Giant robot";
            public String play() {return "DinausorRobot";}
        }

        Transformer prime = new Transformer(){
            public String play(){return "name";}
        };
        System.out.println(prime.play() + " " + new Transformer().name);
    }


}
