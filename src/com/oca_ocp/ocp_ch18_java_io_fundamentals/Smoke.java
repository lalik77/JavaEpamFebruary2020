package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.*;

public class Smoke {

    public void sendAlert(File fn) {

       // try(BufferedWriter w = new BufferedWriter(new FileOutputStream(fn))) {
        try(BufferedWriter w = new BufferedWriter(new FileWriter(fn))) {
            w.write("Alert!");
            w.flush();
            w.write('!');
            System.out.print("1");

        } catch (IOException e) {
            System.out.print("2");

        }finally {
            System.out.print("3");
        }



    }

    public void mySendAlert() throws IOException{
        System.out.println("mySendAlert");

    }

    public static void main(String[] testSignal) {
        new Smoke().sendAlert(new File("alarm.txt"));
        // new Smoke().mySendAlert();

    }
}
