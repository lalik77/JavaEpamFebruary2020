package com.oca_ocp.oca_ch5_using_loop_constructs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compile {

    public static void main(String[] args) {

        /*Q12  code snippet*/
        System.out.println("Q12  code snippet");
        List<String> drinks = Arrays.asList("can", "cup");

        //System.out.println(drinks.size());
        //System.out.println(drinks.get(0));
        //drinks.get(2); // error


        for (int container = drinks.size() - 1; container >= 0; container--) {

            System.out.print(drinks.get(container) + ",");


        }

        /*Q26  code snippet*/

        System.out.println("Q26  code snippet");

        String[] stringsArray = new String[]{"AS", "bd", "gh", "erty"};
        for (String s : stringsArray) {
            System.out.println(s);
        }

        StringBuilder[] sb = new StringBuilder[]{new StringBuilder("AS"),
                new StringBuilder("bd"),
                new StringBuilder("gh"),
                new StringBuilder("erty")
        };

        for (StringBuilder s : sb) {

            System.out.println(sb);
        }

        /*Q30  code snippet*/
        System.out.println("Q30 code snippet");

        int count =10;
        List<Character> chars= new ArrayList<>();
        do{
            chars.add('a');
            for (Character x: chars ) {
                count-=1;
            }
        }while (count>0);
        System.out.println(chars.size()); // => 4

        /*Q31  code snippet*/
        System.out.println("Q31 code snippet");
        int k=0;
        for (int i=10 ; i > 0  ; i --) {

            while(i>3) i-=3;
            k+=1;
        }
        System.out.println(k);

        /*Q49 code snippet */
        q49();



    }


    public static void q49() {

        /*Q49 code snippet */
        System.out.println("Q49 code snippet");

        boolean balloonInFlated = false ;

        do {
            if (!balloonInFlated) {

                balloonInFlated=true;
                System.out.println("inflate-");
            }

        }while (balloonInFlated);
        System.out.println("done");


    }



}

class DoWhile1 {

    static void foo(){

        do {
            int count=0;
            do {
                count ++;
            } while (count < 2 );
            break;
        }
        while(true);

       // System.out.println(count); // error => count is inside loop , local var
    }
}