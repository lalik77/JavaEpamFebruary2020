package com.oca_ocp.oca_ch7_working_inheritance;

/**
 * https://java.meritcampus.com/core-java-topics/constructors-and-inheritance-in-java
 *
 * Here we have a created a hierarchy of classes,
 * C extending B, which in turn extending from A. We only defined the default
 * constructors and included the print statements. As we can observe when a
 * sub-class object is created, the super-class object is by default created. So when object
 * of class B is created both Created A and Created B are printed. Similarly when the object
 * of class C is created Created A, Created B and Created C are printed.
 *
 *
 * Create a class D which extends from C, and define the default constructor with a print statement.
 Remove the default constructor in class A at LINE A, and add another
 constructor which takes one int parameter. Observe the compilation error you get.
 lease note that we need to change the sub-class constructors, to pass the parameter to the newly
 created super-class constructor, otherwise it throws the compilation errors.
 * **/

public class MultiLevelDefaultConstructors_1 {

    public static void main(String arg[])
    {
        System.out.println("---------------");
        A a = new A();
        System.out.println("---------------");
        B b = new B();
        System.out.println("---------------");
        C c = new C();
        System.out.println("---------------");

    }



}

class A
{

    /*A( )    // LINE A
    {
        System.out.println("Created A");
    }*/

}

class B extends A
{
   /* B()
    {

        System.out.println("Created B");
    }*/
}

class C extends B
{
    C()
    {
        System.out.println("Created C");
    }
}

class D extends C {

    D() {
        System.out.println("Created D");
    }
}