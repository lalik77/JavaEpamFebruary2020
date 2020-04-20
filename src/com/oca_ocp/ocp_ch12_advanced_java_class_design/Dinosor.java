package com.oca_ocp.ocp_ch12_advanced_java_class_design;


// Q 29
public class Dinosor {

    public class Pterodactyl {

    }

    public static void main(String[] args) {
        Dinosor dino = new Dinosor();

       //  dino.Pterodactyl(); // not compile

        dino.new Pterodactyl(); // compile Option D
    }
}
