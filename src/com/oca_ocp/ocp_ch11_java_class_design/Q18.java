package com.oca_ocp.ocp_ch11_java_class_design;

    public class Q18 {
        public void convert()  {

            Building b = new Building();
            House h = new House();
            Building bh = new House();

            // Building p = (House) b ; // compile  ClassCastException
            //House q = (Building) h; // not compile
            Building r  = (Building) bh;
            House s = (House)bh; // not ClassCastException

            //House p1 = (House)b; // ClassCastException


            String str = new String();
            Object o= new Object() ;
            // str=o; // not compile
           //  String str2 = (Object)str; // not compile
           // str =(String) o; // ClassCastException



        }

        public static void main(String[] args) {
            new Q18().convert();
        }
}

class Building{}
class House extends Building{}
