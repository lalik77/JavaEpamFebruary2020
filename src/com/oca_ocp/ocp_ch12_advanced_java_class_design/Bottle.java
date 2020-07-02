package com.oca_ocp.ocp_ch12_advanced_java_class_design;

public class Bottle {

    public static class Ship {

        private enum Sail { // ingerently static
            TALL {protected int getHeight() {return 100;}},
            SHORT {protected int getHeight() {return 2;}};

            protected  abstract int getHeight();
        }
        public static void main(String[] args) {
            Bottle bottle = new Bottle();
            // Ship ship = bottle.new Ship();will not compile
        }

    }
}
