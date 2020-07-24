package com.oca_ocp.ocp_ch16_exceptions_and_assertions;


class SpellingException extends RuntimeException{}

public class SpellChecker {

public final static void main(String... participants) {

    try {

        if(!"cat".equals("kat")) {
           /*throw*/ new SpellingException();
        }
    }catch (SpellingException | NullPointerException e) {
        System.out.println("Spelling problem!");
    }catch (Exception e) {
        System.out.println("Uknown problem!");

    }finally {
        System.out.println("Done");
    }
}
}
