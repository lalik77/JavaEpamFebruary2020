package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

//Q39
class DiskPlayer implements AutoCloseable {
    @Override
    public void close() throws Exception {

        System.out.println("closing method");

    }
}
public class LightCycle {

    public static void main(String[] args) throws Exception {
        try (DiskPlayer diskPlayer = new DiskPlayer()) {

            System.out.println("ping");

        }finally {
            System.out.println("pong");
        }

        System.out.println("return");
    }
}
