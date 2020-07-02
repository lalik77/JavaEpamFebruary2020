package com.oca_ocp.ocp_ch18_java_io_fundamentals;

import java.io.*;

public class TextMessage {

    public String receiveText() throws IOException {

        try (Reader r = new FileReader("messages.txt")) {
            StringBuilder s = new StringBuilder();
            int c;
            while ((c = r.read() ) != -1 ) {
                s.append( (char)c);
                if(r.markSupported()) {
                    r.mark(100);
                    r.skip(100);
                    r.reset();
                }
            }
            return s.toString();

        }
    }

    public void sendText(String message) throws Exception {

        try (Writer w = new FileWriter("message.txt")) {
            for(int i=0;i<message.length();i++) {
                w.write(message.charAt(i));
               // w.skip(1);
            }

        }
    }

    public static void main(String[] args) throws Exception {
        final TextMessage m = new TextMessage();
        m.sendText("You up?");
        System.out.println(m.receiveText());
    }
}
