package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.File;
//Q16
public class Resume {
    public void resetWorkingDirectory() throws Exception {
        File f1 = new File("/templates/proofs");
        f1.mkdirs();
        File f2 = new File("/templates");
        f2.mkdir();
        new File(f2,"draft.doc").createNewFile();
       // f1.delete();
        //f2.delete();



    }

    public static void main(String[] args) {
        try {
            new Resume().resetWorkingDirectory();
        } catch (Exception e) {
            new RuntimeException();
        }
    }
}
