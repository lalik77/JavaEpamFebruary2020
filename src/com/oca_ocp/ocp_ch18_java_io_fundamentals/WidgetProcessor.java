package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
//Q31
public class WidgetProcessor {

    public int getWidgetNumber (byte[] data) throws Exception
    {
        try(InputStream is = new ByteArrayInputStream(data)) {
            is.read(new byte[2]);
            if(!is.markSupported() ) return -1;
            is.mark(5);
            is.read();is.read();
            is.skip(5);
            is.reset();
            return is.read();
        }

    }

    public static void main(String[] args) throws Exception {
        final WidgetProcessor p = new WidgetProcessor();
        System.out.println(p.getWidgetNumber(new byte[]{1,2,3,4,5,6,7,8}));
    }
}
