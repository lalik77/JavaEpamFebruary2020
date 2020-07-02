package com.oca_ocp.ocp_ch12_advanced_java_class_design;

public class Matrix {
    private int level =1;

    class Deep {

        private int level =2;

        class Deeper {
            private int level =5;
            public void printReality() {
                System.out.print(level);
                System.out.print(" " + Matrix.Deep.this.level );
                System.out.print(" " + Deep.this.level);
            }


        }


    }

    public static void main(String[] args) {
        Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
        simulation.printReality();
    }
}
