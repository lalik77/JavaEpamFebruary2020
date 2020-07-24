package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

import java.io.Closeable;

class ReadSign implements Closeable {
    public void close() {}
    public String get() {return "Hello";}
}

class MakeSign implements AutoCloseable {

    public void close(){}
    public void send(String message ) {
        System.out.println(message);
    }

}

public class Translate {

    public static void main(String[] args) {
        try ( ReadSign r = new ReadSign() ;
             MakeSign w = new MakeSign(); ) {
            w.send(r.get());

        }
    }
}
