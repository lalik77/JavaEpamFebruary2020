package com.oca_ocp.oca_ch10_practice_exam;
// Q69
interface MakesNoise{}
abstract class Instrument implements MakesNoise {
    public Instrument(){}
    public Instrument(int beats) {}
    public void play(){}
}
public class Drum extends Instrument {
    // public Drum(){}
    public void play(int count) {}
    public void concert() {
        //super.play(5);
        super.play();
    }

    public static void main(String[] args) {
        //MakesNoise mn = new Drum();
        Drum mn = new Drum();
        mn.concert();

       /* String [] str = new String[1];
        System.out.println(str[0]);*/
    }
}
