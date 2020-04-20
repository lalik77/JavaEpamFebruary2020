package com.oca_ocp.oca_ch10_practice_exam;

import java.time.LocalDate;
import java.time.Month;

public class Compile {

    static boolean myBool;

    public static void main(String[] args) {
        String shoe1 = new String("Sandal");
        String shoe2 = new String("flip flop");
        String shoe3 = new String("croc");


        shoe1=shoe2;
        shoe2=shoe3;
        shoe3=shoe1;

        System.out.println(shoe1);
        System.out.println(shoe2);
        System.out.println(shoe3);


        /*Q27 code snippet*/
        System.out.println("Q27 code snippet");

        String name = "Desiree";
        int _number = 694;
        boolean profit$$$;
        boolean $rt ;

        int myNumber;

       // System.out.println(name + " won." + _number + " profit? " + profit$$$); // not initialized var not compile
        // System.out.println(myNumber); // not initilized var
        System.out.println(myBool);


        /*Q61 code snippet*/
        System.out.println("Q61 code snippet");

        int fish = 1 + 2*5>=2 ? 4 : 2 ;
        int mammals = 3 < 3 ? 1 :  5 >= 5 ? 9 : 7 ;
        System.out.println(fish+mammals+"");

        /*Q78 code snippet */
        System.out.println("Q78 code snippet");

        int count = 0 ;
        LocalDate date = LocalDate.of(2017 , Month.JANUARY , 1 ) ;
        while (date.getMonth() != Month.APRIL) {
            date = date.minusMonths(1);
            count++;
        }
        //count++;
        System.out.println(count);



    }
}
