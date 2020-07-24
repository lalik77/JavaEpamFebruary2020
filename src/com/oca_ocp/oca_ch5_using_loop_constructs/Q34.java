package com.oca_ocp.oca_ch5_using_loop_constructs;

public class Q34 {


    public static void main(String[] args) {


        String[] nycTourLoops = new String[] {"DownTown","UpTown","Brooklyn"};
        String[] times = new String[] {"Day","Night"};

        for(int i =0 , j=0 ; i<nycTourLoops.length && j<times.length ; i++ , j++) {

            System.out.print(nycTourLoops[i] + " " + times[j] + "-" );
        }

    }


}
