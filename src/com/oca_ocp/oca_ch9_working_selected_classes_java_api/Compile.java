package com.oca_ocp.oca_ch9_working_selected_classes_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Compile {

    /* Q5 code snippet */

    List frisbies = (List) new Object(); // => it will throw runtime exception

    // List frisbies = new Object();

    /*Q7 code snippet */

    // StringBuilder sb = new StringBuilder("radical").insert(sb.length(),"robots") // will not compile , the
    // sb reference does not exist;


    /* Q11 code snippet */
    public static void main(String[] args) {

        System.out.println(" Q11 code snippet ");

        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-");

        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());

        /*Q12 code snippet*/

        System.out.println("\n Q12 code snippet ");

        ArrayList<Integer> test = new ArrayList<>();
        System.out.println(test.size());

        /*Q13 code snippet*/

        System.out.println("\n Q13 code snippet ");

        // Predicate<StringBuilder> p = (StringBuilder b) ->{return true;} ;// error

        //  Predicate<StringBuilder> p = (StringBuilder b) ->true;


        /*Q16 code snippet */

        System.out.println("\n Q13 code snippet ");

        //  Predicate<String> pred1 = s->false ; //
        // Predicate<String> pred2 = (s) -> false ; //
        // Predicate<String> pred3 = String s -> false ; // error the only one must not compile
        // Predicate<String> pred4 = (String s) -> false ; //


        /*Q20 code snippet*/
        System.out.println("\n Q20 code snippet ");
        StringBuilder sb = new StringBuilder("radical ");

        // sb = new StringBuilder("radical ").append("robots");// Option A ->radical robots
        // sb = new StringBuilder("radical ").delete(1,100).append("obots").insert(1,"adical r");// Option B ->radical robots
        // sb = new StringBuilder("radical ").insert(7,"radical");// Option c ->radicalrobots
        sb = new StringBuilder("radical ").insert(sb.length(), "robots");// Option D ->radical robots
        System.out.println(sb);


        /*Q21 code snippet*/

        System.out.println("\nQ21 code snippet ");

        String[] array = {"Natural History", "Science"};
        List<String> museums = Arrays.asList(array);
        // System.out.println(museums.get(0)); // Natural History
        // System.out.println(museums.get(1)); // Science
        museums.set(0, "Art");
        System.out.println(museums.contains("Art"));
        System.out.println(museums.get(0));


        /*Q24 code snippet test method */

        secret("Hello World");

        /*Q25 code snippet*/

        List balloons = new ArrayList();


        /* Q28 code snippet */

        System.out.println("\nQ28 code snippet");

       Predicate<String> dash = c -> c.startsWith("-");
       //  Predicate dash = c->c.startsWith("-"); // not compile




    }

    /*Q24 code snippet*/

    public static void secret(String mystery) {

        mystery = mystery.replace("1", "8");
        mystery.startsWith("paper");
        String s = mystery.toString();
        System.out.println("\nQ24 code snippet");

        System.out.println(mystery);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("abs");
        // sb.startsWith("a"); // error

    }


}