package lesson200407;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class MySream {

    Collection<String> collection = new ArrayList<>();

    Stream<String> stream = collection.stream();

    Stream<Integer> empty = Stream.empty();

    Stream<Integer> stream1 = Stream.of(0);

    Stream<Integer> stream2 = Stream.of(1,2,3,4);

    Integer[] array = {1,2,3,4,5};
    Stream<Integer> stream3 = Stream.of(array);

    //Stream<Integer> emptyStream = Stream.ofNullable(null);

    static boolean isProcess () {return true;}

    public static void main(String[] args) {
      //  Stream.iterate(0,i->i+2).limit(20).skip(1).forEach(System.out::println);
      //  Stream.iterate(0,i->i+2).skip(1).limit(20).forEach(System.out::println);

        long count =  Stream.of(1,2,3,4,5).map(i-> {
            System.out.println(i);
            return i*2;
        }).count();


        System.out.println(count);





    }
}
