package com.oca_ocp.oca_ch7_working_inheritance;

interface SpeakDialogue {

      default int talk(){return 7;}
}
interface SingMonologue {
    // default int talk(){return 5;} // two default signature ;
}


public class Performance implements SpeakDialogue,SingMonologue {

   // public int talk() {return 1;}
    public int talk (String ...x) {
        return x.length;

    }

    public static void main(String[] args) {
        System.out.println(new Performance().talk());
    }
}
