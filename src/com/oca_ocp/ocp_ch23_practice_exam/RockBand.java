package com.oca_ocp.ocp_ch23_practice_exam;

interface DoubleBass {
    void strum();
    default int getVolume(){ return 5;}
}

interface BassGuitar {
    void strum();
    default int getVolume(){ return 5;}
}

public class RockBand {
    public static void main(String[] args) {

        final class MyElectricBass extends ElectricBass {
            public void strum() {
                System.out.println("E");
            }
        }

    }
}

class ElectricBass implements DoubleBass , BassGuitar {
    @Override
    public void strum() {
        System.out.println("A");


    }
    @Override
    public int getVolume() {return 1;} // without this declaration it will not compile


}
