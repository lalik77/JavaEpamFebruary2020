package com.oca_ocp.ocp_ch12_advanced_java_class_design;


interface Alex {
    default void write() {}
    static void publish(){}
    void think();
}
interface Michael {
    default void write(){}
    static void publish(){}
    void think();
}

public class Twins implements Alex,Michael {

    @Override
    public void write(){}
   // @Override
    public static void publish(){}
    @Override
    public void think(){
        System.out.println("Thinking...");
    }
}
