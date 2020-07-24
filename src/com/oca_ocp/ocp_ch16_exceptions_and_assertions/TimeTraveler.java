package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

class TimeException extends Exception {}
//Q31
class TimeMachine implements AutoCloseable {

    int v;
    public TimeMachine (int v) {
        this.v=v;
    }
    public void close() throws Exception {
        System.out.print(v);
    }
}

public class TimeTraveler {

    public static void main(String[] args) /*throws Exception*/ {
        try( TimeMachine timeSled = new TimeMachine(1) ;
             TimeMachine delorean = new TimeMachine(2);
             TimeMachine tardis = new TimeMachine(3) ) {

        }catch (Exception e) {
            System.out.print(4);
        }finally {
            System.out.print(5);
        }
    }



}
