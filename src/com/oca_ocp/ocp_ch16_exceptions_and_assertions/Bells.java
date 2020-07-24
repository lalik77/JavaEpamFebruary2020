package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

import java.io.Closeable;
import java.io.IOException;

public class Bells {
    class Player implements AutoCloseable {
        @Override
        public void close() throws RingException {}

    }

    class RingException extends Exception{

        public RingException (String message) {}
    }

    public static void main(String[] args) throws Throwable {
        try (Player p=null) {
            throw new Exception();
        } catch (Exception e) {

        }catch (Error r) {

        }

    }
}
