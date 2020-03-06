package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Jump {
    private int rope = 1;
    protected boolean outside;

    public Jump() {
       this(4); //p1
        outside=true;
    }

    public Jump(int rope) {
        this.rope = outside ? rope : rope+1;
    }

    public static void main(String[] bounce) {
        System.out.println(new Jump().rope);
    }
}
