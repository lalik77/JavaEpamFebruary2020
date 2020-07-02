package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.File;
//Q23
public class Journey {

    public static void main(String[] args) {
        File file = new File ("/Earth");
        System.out.println(file.getParent() + "-"  /*file.getParent().getParent()*/);
    }
}
