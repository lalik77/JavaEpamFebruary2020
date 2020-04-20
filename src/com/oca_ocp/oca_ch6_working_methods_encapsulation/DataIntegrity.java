package com.oca_ocp.oca_ch6_working_methods_encapsulation;

//Q20
public class DataIntegrity {

    private int score;
    public DataIntegrity(){
        super();
        DataIntegrity.this.score = 5;


    }

    public static void main(String[] books) {
        final DataIntegrity johny = new DataIntegrity();
        assert (johny.score>2) : johny.score++;
       // assert (johny.score>=5) : System.out.print("No input");
        System.out.println("Made it");
        System.out.println(johny.score);
;


    }
}
