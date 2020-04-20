package com.oca_ocp.oca_ch10_practice_exam.furryfriends;

interface Friend {

    /* protected*/ String getName();
}

class Cat implements Friend {

    public String getName() {
        return "Kitty";
    }
}


public class Dog implements Friend{

    public String getName() throws RuntimeException { return "Doggy";  }

    public static void main(String[] adoption) {

        Friend friend = new Dog();

        //System.out.println((((Cat) friend).getName())); // ClassCastException

        System.out.println((((Dog)null).getName())); // NullPointerException


    }


}



