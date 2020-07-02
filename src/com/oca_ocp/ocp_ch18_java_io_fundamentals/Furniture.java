package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
//Q27
public class Furniture {

    public final static void main(String... inventory) throws Exception {

        Writer w = new FileWriter("couch.txt");

        try (BufferedWriter bw = new BufferedWriter(w)) {

            bw.write("Blue coach on sale!");
        }finally {
            //w.flush();
            w.close();
        }
        System.out.println("Done");
    }
}
