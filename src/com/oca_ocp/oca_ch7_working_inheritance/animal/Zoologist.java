package com.oca_ocp.oca_ch7_working_inheritance.animal;

public class Zoologist {

    Canine animal;

    public final void setAnimal(Dog animal) {
        this.animal=animal;
    }

    public static void main(String[] furryFriends) {

        new Zoologist().setAnimal(new Husky());
    }
}
