package com.oca_ocp.basics;

public class Airplane {

    static int start =2;
    final int end;// Без инициализации в конструкторе
                  // переменной компилятор выдаст ощибку
    // final  int middle; // -> final , значит должно поступить значение
    public Airplane(int x) {

        x=4;
        end=x;

    }
    public void fly(int distance) {

        System.out.print(end-start+" ");
        System.out.print(distance);
    }

    public static void main(String[] args) {
        new Airplane(10).fly(5);
    }
}
