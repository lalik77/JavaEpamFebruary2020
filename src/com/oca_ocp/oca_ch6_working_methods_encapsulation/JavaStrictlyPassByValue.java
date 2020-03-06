package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class JavaStrictlyPassByValue {

    public static void main(String[] args) {
        int x=5;
        change(x);
        System.out.println(x); // => 5  is still 5
        /*We pass an int to the function “change()”
        and as a result the change in the value of that integer is not
        reflected in the main method.
         Like C/C++, Java creates a copy of the variable being passed in the method
         and then do the manipulations. Hence the change is not reflected in the main method.*/

        System.out.println("---------------------------------------------");
        // t is a reference
        Test t = new Test(5);
        // Reference is passed and a copy of reference
        // is created in change()
        change(t);
        System.out.println(t.x); // => 5

         /*
         Changes are reflected back if we do not assign reference to a
         new location or object: If we do not change the reference to refer some other
         object (or memory location), we can make changes to the members and these
         changes are reflected back.filter_none
         */

        System.out.println("-----------------------------------------");
        // anotherTest is a reference
        Test anotherTest = new Test(87);

        System.out.println(anotherTest.x); //=> 87

        // Reference is passed and a copy of reference
        // is created in anotherChange()

        anotherChange(anotherTest,257);
        System.out.println(anotherTest.x); // => 257


    }

    public static void change (int a) {
        a=10;


    }

    /*overloading version*/
    public static void change(Test t){

        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main

        t=new Test();
        t.x=10;
    }

    public static void anotherChange (Test t, int a) {

        t.x=a;
    }

}

class Test {

    int x;
    Test(int i) { x=i;}
    Test(){ x=0;}


}

