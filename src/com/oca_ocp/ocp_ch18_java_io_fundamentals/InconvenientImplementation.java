package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.Console;
import java.io.IOException;
//Q35
public class InconvenientImplementation {

    public static void main(String[] args) throws IOException {

        Console c = System.console();
        if(c!=null) {

            c.writer().write('P');
            c.writer().write('a');
            c.writer().write('s');
            c.writer().write('s');
            c.writer().flush();

            int i;
            StringBuilder sb = new StringBuilder();
            while ( (i= c.reader().read() ) != 'x') {
                sb.append((char)i);
            }
            c.writer().format("Result : %s",sb.toString());
        }
    }
}
