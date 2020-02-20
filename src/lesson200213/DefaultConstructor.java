package lesson200213;

// TODO работа конструкторов касательно наследования

public class DefaultConstructor {
    public static void main(String[] args) {

        A a = new A();
        B b = new B(5);

    }
}

class A {

    int a;
     public A() {} //default constructor , если убрать его ,
                   // то не не дефолт конструктор у B выдаст ошибку

    public A(int a) {
        this.a=a;

    }

}

class B extends A {

    int i;

   /* public B () {   //

        //super();
    }*/


   public B(int i) {
       this.i=i;
   }




}