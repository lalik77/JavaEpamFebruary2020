package com.oca_ocp.ocp_ch11_java_class_design;


// Q7
public class Hammer_Tools {
}

class Tools {

     void use () {}
}


class Hammer extends Tools {

    /*private*/ void use(){} // does not compile with private
    public void bang () {}
}