package lesson200206;

public class BoxingUnboxingInt {

    public static void main(String []  args) {

    Integer i1 = 10;
    Integer i2 = 10;


        Integer i3 = 128;
        Integer i4 = 128;


        System.out.println(i1==i2);
        System.out.println(i3==i4); //  Другая область памяти так как i3 и i4 > 127
        System.out.println(i3.equals(i4));


        /*Дополнительно от меня */

        int x= 1;
        char c = 5; // '\u0005'
        char c1=60000; // '\u0006'
        //char c2=e;// ->Error
        char c3 = 'a';

        Object o,o1,o3;
        o=c;
        System.out.println("c var is " + c + " " + o.getClass() ); // java.lang.Character

        o=x+c;
        o1=x+c1;
       // o+=x+c3; -> error operator + cannot be applied here



        System.out.println("x + c = " + o +
                " type of primitive is " + o.getClass().getTypeName().substring( 10,o.getClass().getName().length() ) );

        System.out.println("x + c1 = " + o1 +
                " type of primitive is " + o1.getClass().getTypeName().substring( 10,o1.getClass().getName().length() ) );

        System.out.println(c1);


    }
}
