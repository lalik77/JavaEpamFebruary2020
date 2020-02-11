package lesson200206;

public class DefaultValues {

    static int ii;
    int i;
    double d;

    void method () {

        int j;
        //System.out.println(j); // error - j have to be initialised
        System.out.println(i);
        System.out.println(d);
        System.out.println(ii);
    }

    public static void main(String []  args) {

        DefaultValues instance = new DefaultValues();

        instance.method();

        int intVar=100;
        System.out.println(intVar);
        long longVar=1_000_000_000__000L;
        intVar += longVar;
        System.out.println(intVar); // -> -727379868 - прокрутка

        /* Errors */

        // System.out.println(i); //  java: non-static variable i cannot be referenced from a static context
        // System.out.println(d); //  java: non-static variable d cannot be referenced from a static context


    }
}
