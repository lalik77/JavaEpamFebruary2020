package com.oca_ocp.ocp_ch23_practice_exam;

public class RollerCartWheel {

    Roller<CartWheel> wheel1 = new Roller<CartWheel>();
   // Roller<Wheel> wheel2 = new Roller<CartWheel>(); // does not compile
    Roller<? extends Wheel> wheel3 = new Roller<CartWheel>();
    Roller<? extends Wheel> wheel4 = new Roller<Wheel>();
   // Roller<? super Wheel> wheel5 = new Roller<CartWheel>(); // does not compile
    Roller<? super Wheel> wheel6 = new Roller<Wheel>();


}

class Roller < E extends Wheel > { }

class Wheel {}

class CartWheel extends Wheel {}