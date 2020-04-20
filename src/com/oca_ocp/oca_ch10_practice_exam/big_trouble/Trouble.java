package com.oca_ocp.oca_ch10_practice_exam.big_trouble;

public class Trouble extends Big {

   // public Trouble() { super(true);}
    //public Trouble() { }
    public Trouble (int deep) {

        super(false);
      // this();
    }

    public Trouble(String now , int ... deep) {
        this(3);
    }

    public Trouble(long deep) {
       // this("check",deep);
        this("check",(int)deep); // correction
    }

    public Trouble(double test) {

        super (test>5 ? true : false);
    }

}
