package com.oca_ocp.ocp_ch16_exceptions_and_assertions;


import com.sun.xml.internal.ws.Closeable;

//Q40

final class FallenException extends Exception {

}

final class HikingGear implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new FallenException();
    }



}


public class Cliff {


    public final void climb() throws Exception{

        try(HikingGear gear = new HikingGear()) {
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
        try {
            new Cliff().climb();
        }catch (Throwable t) {
            System.out.println(t);
        }
    }
}
