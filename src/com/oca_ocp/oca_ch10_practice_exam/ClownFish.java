package com.oca_ocp.oca_ch10_practice_exam;

class BubbleException extends Exception { }
class Fish{

    Fish getFish() throws BubbleException {

        throw new RuntimeException("fish");
    }


}
public class ClownFish extends Fish {

    public final ClownFish getFish() {

        throw new RuntimeException("clown!");
    }

    public static void main (String[] args) /*throws Exception*/ {

        final Fish f = new ClownFish();
        //f.getFish(); // error not compile

        final ClownFish clownFish = new ClownFish();
        clownFish.getFish();// compile without error

    }


}
