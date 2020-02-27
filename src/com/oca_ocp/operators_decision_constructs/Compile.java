package com.oca_ocp.operators_decision_constructs;

public class Compile {

    public static void main(String[] args) {
        long thatNumber = 5>=5 ? 1+2 : 1*1 ;

        if (++thatNumber < 4) thatNumber+=1;

        System.out.println(thatNumber);

        /*Question 19 snipet */

        int time = 11;
        int day = 4;
        int tmp=4/11; // - > 0
        System.out.println(tmp);
        // String dinner = time > 10 ? day ? "Takeout" : "Salad " : "Leftovers"; // error day not boolean
        String dinner = time > 10 ? day>1 ? "Takeout" : "Salad " : "Leftovers";
        System.out.println(dinner);

        /*Question 27 snipet*/
        String myTestVar = "";
        System.out.println(myTestVar.equals(null)); // - > false

        /*Question 30 snippet*/

        int x=10,y=9;
        boolean w = true ,  z = false;
        System.out.println(" /*Question 30 snippet*/");
       // System.out.println(x=w);error x int , w boolean


        x = w ? y++ : y-- ; // x присваивается ...? ... : ....
        System.out.println(x);


        /* Question 32 snippet */
        System.out.println(" /*Question 32 snippet*/");
        int a= 12 + 6*3 % (1+1); // 12 + ( 6*3 )->1 , (1+1)->2 , ( 18%2 ) -> 3
        System.out.println(a);

        /*Chap 3 Question 44 snippet*/
        System.out.println(" /*Question 44 snippet*/");
        int characters = 5;
        int story = 3;
        double movieRating = characters <= 4 ? 3 : story > 1 ? 2 : 1; //->2
       // double movieRating = characters <= 4 ?  story > 1 ? 2 : 1 : 3; // -> 3

        System.out.println(movieRating);


    }




}
