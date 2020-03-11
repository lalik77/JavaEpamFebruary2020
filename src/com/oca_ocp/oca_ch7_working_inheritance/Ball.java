package com.oca_ocp.oca_ch7_working_inheritance;

/*Q29 */

public class Ball {

    protected final int size;

    //public Ball(){}; // explicit no arg constructor

    public Ball(int size) {
        this.size=size;
    }


}

interface Equipment {}

 class SoccerBall extends Ball implements Equipment {

    public SoccerBall(){
        super(5);
    }

    public Ball get() {return this;}

     public static void main(String[] passes) {

        Equipment equipment = (Equipment) (Ball)new SoccerBall().get();

         System.out.println(((SoccerBall) equipment).size);

     }
}