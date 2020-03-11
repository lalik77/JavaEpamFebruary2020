package com.oca_ocp.oca_ch8_handling_exceptions;

public class Baseball {

    public static void main(String ... teams) {

        try{
            int score = 1;
            System.out.println(score++);

        }catch (Throwable t){
        //    System.out.println(score++);
        }finally {
        //    System.out.println(score++);

        }
      //  System.out.println(score++);


    }
}
