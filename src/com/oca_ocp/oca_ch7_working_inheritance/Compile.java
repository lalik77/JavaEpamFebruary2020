package com.oca_ocp.oca_ch7_working_inheritance;

public class Compile {

    /*  Q33  */

    SubClass sub = new SubClass();
    SuperClass sup = sub;

    SubClass down = (SubClass) sup; // explicit cast assign to a subClass

    Object o = sup; //
    SubClass subClass =(SubClass) new SuperClass(); // explicit cast assign to a subClass







    public static void main(String[] args) {

       // SuperClass sup1 = new SubClass();

        System.out.println(new SubClass().a);

        //System.out.println(sup1.a);

        /*Q33 code snippet*/

        Number n = 12 ;
        Integer i = 4;
        Object obj=null;
       // n=i;

        i =(Integer) n;

        obj=i;
        System.out.println(obj);


    }

}

class SuperClass {
    protected int a=5;
     SuperClass(){}
   public SuperClass(int a){this.a=a;}
}
class SubClass extends SuperClass{

     int a;
    SubClass(){}
    public SubClass(int a) {this.a=a;}
}


