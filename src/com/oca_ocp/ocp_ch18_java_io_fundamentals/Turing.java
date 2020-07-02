package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.Console;
import java.util.Scanner;

//q 24
public class Turing {

    public static void main(String[] args) {
        Scanner scanner = null;
        Console c =  System.console();
        final String response;
        if(c == null) {
            System.out.println("Whats ur  name");
            scanner=new Scanner(System.in);

            response=scanner.next();

        }
        else {

            response=c.readLine("are u human");
        }


        System.out.println("Welcome " + response);
    }
}
