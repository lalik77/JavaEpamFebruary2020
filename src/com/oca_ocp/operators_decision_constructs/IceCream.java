package com.oca_ocp.operators_decision_constructs;

public class IceCream {

    public static void main(String... args) {
        int flavours = 30 ;
        int eaten = 0 ;

        switch (flavours) {

            case 30: {
                        eaten ++ ;
                        System.out.println("case 30");
            }
            case 40: {
                       eaten +=2;
                       System.out.println("case 40 ");
                      }
            default : {
                        eaten-- ;
                        System.out.println("case default");
                    }

        }
        System.out.println(eaten);

    }
}
