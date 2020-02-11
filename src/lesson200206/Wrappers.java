package lesson200206;

public class Wrappers {


    public static void main(String []  args) {

       int i1=10;
       Integer i2=10;
       Integer i3 = new Integer(20); // у него было вычеркнуто
       Integer i4 = Integer.valueOf(20); // у него было вычеркнуто // Упаковка

       process(i2); // Происходит Распоковка - unboxing

        //Method changeInteger

        int intVar=10;
        Integer iIvar1=10;
        changeInteger(10);
        changeInteger(iIvar1);
        System.out.println("value of intVar after calling method " + intVar);
        System.out.println("value of iIvar1 after calling method " + iIvar1);

    }


    public static void  process(int i) {

        System.out.println("i'm " + i);
    }

    public static void  process1(Integer i )  { //
        System.out.println("i'm " + i);
    }

    public static void changeInteger(Integer x) {

        System.out.println("Integer before change " + x);
        x=new Integer(20);
        System.out.println("Integer after change " + x);
    }
}
