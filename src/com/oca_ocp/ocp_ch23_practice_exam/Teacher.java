package com.oca_ocp.ocp_ch23_practice_exam;

import com.oca_ocp.java_data.TennisBall;

public class Teacher {

    public int checkClassWork (int choices ) {

        assert choices++==10 : 1;
        assert true!=false : new StringBuilder("Answer2");
        assert (null==null) : new Object();
        assert ++choices==11 : "Answer4";
        assert 2==3 : "";
        return choices;
    }

    public static final void main(String...students) {

         new Teacher().checkClassWork(10);
       // System.out.println(a);

       /* try {
            new Teacher().checkClassWork(10);

        }catch (Error e) {

            System.out.println("Bad ides");
            throw e;
        }*/
    }
}
