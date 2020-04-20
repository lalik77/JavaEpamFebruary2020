package com.oca_ocp.ocp_ch12_advanced_java_class_design;


@FunctionalInterface
interface Study {

    abstract int learn (String s , int d);
}

class BiologyMaterial implements Study {

    @Override
    public int learn (String s , int d ) {

        if(s==null) return d;
        else return d+1;
    }

    // lambda implementaion




}

public class Scientist {
    public static void main(String[] courses) {


        final Study s = new BiologyMaterial(){};
       // final BiologyMaterial b = new BiologyMaterial(){};

        System.out.println( s.learn(courses[0] , Integer.parseInt(courses[1])  )  );

       //  (x,y)-> { return   x == null ? y : y+1 ;} ;

        final Study s1 = (x,y)-> {return x== null ? y:y+1;}; // Option C

        //s1.learn( (x,y)-> { return   x == null ? y : y+1  );


    }


}
