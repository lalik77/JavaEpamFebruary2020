package lesson200210;

public class AbstractExample {

    public static void main(String[] args) {

        B b = new B();

    }
}

abstract class A {

    abstract void foo();// Abstract metod

}


class B extends A {

    @Override
    void foo() {
        System.out.println("I'm foo");
    }
}






