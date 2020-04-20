package com.oca_ocp.ocp_ch23_practice_exam;

//Q7

interface HasHue {

    String getHue();
}

enum Colors implements HasHue {

    red {
        public String getHue () { return "FF0000";} },
}

class Book {}

final public class ColoringBook extends Book {


}
