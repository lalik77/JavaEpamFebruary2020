package lesson200206;

/*
 byte 2^8
 short 2^16
 int  2^32
 long
 float
 double
 char
 boolean
 */

public class Variables {
    public static void main(String[] args) {

        /* Расширяющее (повышающее ) преобразование * . Результирующий тип имеет имеет больший диапозон значений,
        чем исходный тип         */

        // Widening Casting - Implicit conversion


        int x=200;
        System.out.println(x);
        long y = (long)x;
        System.out.println( y );
        long z=x;
        System.out.println("z - " + " hashcode() - " + Long.hashCode(z) + " toBinaryString() - " + Long.toBinaryString(z));
        Object o=z;
        System.out.println("z - " + " z var is a primitive :  " + o.getClass().getName().substring( 10,o.getClass().getName().length() ) );
        long value1=(long) 200 ; // необязательно компилятор делает это автоматом
        System.out.println(value1);


        /* Сужающее (понижающее ) преобразование . Результирующий тип имеет меньший диапозон значений чем исходный */

        // Narrowing Casting - Explicit (Larger to smaller Type)

        long longVal = 1000L;
        o=longVal;
        System.out.println("longVal is - " + longVal + "  longVal variable is a primitve - type : " + o.getClass().getName().substring( 10,o.getClass().getName().length() ) );
        int intVal=(int)longVal ; // Обязательно
        o=intVal;
        System.out.println("intVal is - " + intVal +"  intVal variable is a primitve - type : " + o.getClass().getName().substring( 10,o.getClass().getName().length() ) );


        /*От меня */

        // Implicit
        System.out.println("");

        System.out.println("1.1 - Implicit conversion from int to float with lost data\n");

        int x1=123456789;
        int x2=99999999;

        float f1=x1;
        float f2=x2;

        System.out.println("x1 = " + x1 + "   After implicit conversion f1 = " + f1 + " we have lost data");
        System.out.println("x2 = " + x2 + "   After implicit conversion f2 = " + f2 + " we have lost data");


        System.out.println("\n1.2 Implicit conversion long to float with lost data\n");


        long longVar1=123456789012345L;
        float floatVar1 = longVar1;
        System.out.println("longVar1 - " + longVar1);
        System.out.println("floatVar1 -  " + floatVar1);




        System.out.println("");

        System.out.println("2.1 Implicit conversion from float to double without lost data");


        float f3=1.2345f;
        double d1=f3;
        double d2= 1.2345D;


        System.out.println("f3 - " + f3); //f3 - 1.2345
        System.out.println("d1 - " + d1); //d1 - 1.2345000505447388
        System.out.println("--------------------------");
        System.out.printf("f3 = %.16f\n",f3); // f3 = 1,2345000505447388
        System.out.printf("d2 = %.16f\n",d2); // d2 = 1,2345000000000000


        System.out.println("-----------------------------------------------------------");
        System.out.println("Типы данных, переменные.Приведение типов в выражении\n");

        long longVar2 = 10_000_000_000L;
        int  intVar1;
        intVar1=(int)longVar2; // Происходит потеря < -  Narrowing Casting
        System.out.println("intVar1  = "+intVar1 + " произошла потеря данных!\n");

        byte byteVar1 = 127;
        byte byteVar2 = -128 ;
        // byteVar2 =  byteVar1  * 2 ;  // Error -> incompatible types.   Required: byte   Found:  int

        //Приведение int к byte explicit
        byteVar2 = (byte) (byteVar1*2) ;
        System.out.println("After  (byteVar2 = (byte) (byteVar1*2) ) - >  byteVar2 = " + byteVar2);

        //Приведение byte к int implicit
        byte byteVar3=50 , byteVar4=20 , byteVar5 = 127 ;
        int intVar4 = byteVar3 * byteVar4 * byteVar5;

        System.out.println("\nПриведение с byte в int IMPLICIT - intVar4 = " + intVar4);

        //Приведение double в int

        double doubleVar1 = 12.34;
        int intVar5 ;
        intVar5 = (int) doubleVar1 ;
        System.out.println("Приведение с double в int EXPLICIT - intVar5 = " + intVar5);


        Byte byteVar6 = 8 ; // class Byte

        System.out.println( "Result of byteVar6.byteValue() = " + byteVar6.byteValue() + ", result of byteVar6 = " + byteVar6);

        Double doubleVar2 = 12.0512D; // class Double
        System.out.println("Result of doubleVar2.doubleValue() = "+doubleVar2.doubleValue() + ", result of  doubleVar2 = "+ doubleVar2);







    }
}
