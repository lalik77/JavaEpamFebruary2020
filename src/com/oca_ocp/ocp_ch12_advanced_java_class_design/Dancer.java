package com.oca_ocp.ocp_ch12_advanced_java_class_design;

//Q39
class Leader {}
class Follower /*extends Leader*/ {}
abstract public class Dancer {
    public Leader getPartner() {return  new Leader();}
    abstract public Leader getPartner (int count) ;
}

abstract  class SwingDancer extends Dancer {

 /*  public Follower getPartner() {

        return new Follower();
    }*/
}