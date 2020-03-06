package com.oca_ocp.oca_ch6_working_methods_encapsulation.wardrobe;

// import static com.oca_ocp.oca_ch6_working_methods_encapsulation.clothes.Store.*; // keyword static important

import static com.oca_ocp.oca_ch6_working_methods_encapsulation.clothes.Store.getClothes;



public class Closet {

    public void borrow(){

        System.out.println("Borrowing clothes " + getClothes());
    }
}
