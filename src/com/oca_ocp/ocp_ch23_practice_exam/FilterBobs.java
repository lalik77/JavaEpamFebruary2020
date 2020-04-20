package com.oca_ocp.ocp_ch23_practice_exam;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

interface ApplyFilter {
    void filter (List<String> input);
}


public class FilterBobs {

    static Function<String,String> first = s -> {
    System.out.println(s);
    return s;
};

    static Predicate second = t->"bob".equalsIgnoreCase((String) t); // does not compile t is Object type

    public void process(ApplyFilter a , List<String> list) {

        a.filter(list);
    }

    public static void main(String[] contestants) {

        final List<String> people = new ArrayList<>();
        people.add("Bob");
        people.add("bob");
        people.add("Jehnifer");
        people.add("Samantha");

        final FilterBobs f = new FilterBobs();
        f.process(  q->  { q.remove(second);
                          // q.forEach(first); // not compile

                         } ,    people);
    }


}
