package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Stars {

    private int inThe = 4 ;
    public void Stars(){ // it seems like a no-argument constructor
                         // this is not a constructor , return statement


        //super(); // call super() must be first statement in constructor body
    }

    public Stars(int inThe){
        this.inThe=this.inThe; // while tes assignement to itself has no effect it compiles
    }

    public static void main(String[] args) {
        System.out.println(new Stars(2).inThe);//->4
    }
}
