package com.oca_ocp.oca_ch8_handling_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Backup {
    public void performBackup(){

        try {
            throw new IOException("Disk not found");
        }catch (Exception e) {

            try {
                throw new FileNotFoundException("File not found");
            }catch ( FileNotFoundException ex /*e this is the error*/ ){

                System.out.println("Failed");
            }
        }


    }

    public static void main(String[] args) {
        new Backup().performBackup();
    }



}
