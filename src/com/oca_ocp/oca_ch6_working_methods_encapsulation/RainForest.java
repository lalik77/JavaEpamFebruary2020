package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class RainForest extends Forest {

    public RainForest(long treeCount) {
        //super(5);

        this.treeCount =treeCount+1;


    }
}


class Forest{

    public long treeCount ;
     Forest(){}
    public Forest(long treeCount) {

        this.treeCount = treeCount+2;
    }


}