package lesson200204;

/**
 *
 *Работа с пакетами
 *
 * **/

public class First {

    //Default
    int a = 2;
    int b= 3+a;


    public static void main(String[] args) {



        System.out.println("Я в main");

        A obj1=new A();

        //  foo(); не компилируется

        obj1.foo();

         B objB= new B();

        System.out.println(objB.getFromB() );



    }

}

class A {

    First o=new First();

    void foo() {

        System.out.println("Я foo " + o.a+ " и " + o.b);
    }
}
