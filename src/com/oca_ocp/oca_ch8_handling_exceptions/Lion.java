package com.oca_ocp.oca_ch8_handling_exceptions;

class BigCat {

    void roar(int level) throws RuntimeException { // throw instead of throws

        if (level < 3 ) throw new IllegalArgumentException("Incomplete");
        System.out.println("Roar!");

    }

}

public class Lion extends BigCat {
    public void roar() {
        System.out.println("Roar!!!");

    }

    public static void main(String[] args) {
        final BigCat kitty = new Lion();
        kitty.roar(2);
    }
}
