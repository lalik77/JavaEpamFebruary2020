package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.*;

public class Unicorn {
    public void findUnicorns() {

        try(InputStream o = new ObjectInputStream( readBook() ) ) {

            while(o.read()!= -1) {
                System.out.println(o.read());
            }
        }catch (Throwable t) {
            throw new RuntimeException(t);
        }


    }

    private InputStream readBook() throws IOException {
        return new BufferedInputStream(new FileInputStream("magic.book"));

    }

    public static void main(String[] args) {
        new Unicorn().findUnicorns();
    }
}
