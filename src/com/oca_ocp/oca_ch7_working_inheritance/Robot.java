package com.oca_ocp.oca_ch7_working_inheritance;

import java.io.EOFException;

class Machine {
    public boolean turnOn() throws EOFException {return  true ;}
}

public class Robot extends Machine {

    public boolean turnOn() throws EOFException /*Exception */ { return false;}

    public static void main(String[] args) throws Exception {
        Machine m = new Robot();
        System.out.println(m.turnOn());
    }


}
