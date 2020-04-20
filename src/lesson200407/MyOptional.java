package lesson200407;

import java.util.Optional;

public class MyOptional {

    public static  Optional<String> foo (String s) {

        return Optional.of(s);
    }


    public static void main(String[] args) {

        System.out.println(foo("hello"));

        Optional<Integer> op1 = Optional.ofNullable(9455);
        System.out.println("Op1: " + op1);

        Optional<String> op2 = Optional.ofNullable(null);

        System.out.println( "Op2: " + op2 );


    }
}
