package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class PrimeReader {
    public static void main(String[] args) throws Exception {

        try(InputStream is = new FileInputStream("prime6.txt")) {
            is.skip(1);
            is.read();
            is.skip(1);
            is.read();
            is.mark(4);
            is.skip(1);
            is.reset();
            System.out.println(is.read());
        }
    }
}
