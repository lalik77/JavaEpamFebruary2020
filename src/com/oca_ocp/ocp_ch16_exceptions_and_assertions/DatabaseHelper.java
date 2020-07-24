package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
//Q38
public class DatabaseHelper {

    static class MyDataBase implements Closeable {

        public void close () throws IOException {
            System.out.println(2);
        }

        public void write (String data) {}
        public String read() {return null;}
    }

    public static void main(String[] args) throws Exception {

        try (MyDataBase myDataBase = new MyDataBase() ) {

        }finally {
            System.out.println("1");
        }

    }
}
