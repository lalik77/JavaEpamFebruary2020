package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

import java.io.IOException;
//Q16
public class Beach {

    class TideException extends Exception {}

    public void surf() throws RuntimeException {

        try {
            //throw new IOException( );
            throw new TideException();
        }catch ( TideException | RuntimeException i) {}
    }
}
