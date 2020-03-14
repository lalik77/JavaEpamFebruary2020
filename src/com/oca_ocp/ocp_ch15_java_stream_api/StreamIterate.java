package com.oca_ocp.ocp_ch15_java_stream_api;

import java.util.stream.Stream;


/** mkyong.com **/
public class StreamIterate {

    public static void main(String[] args) {

        /*Stream of 0-9*/

        Stream.iterate(0,i->i+1).limit(10).forEach(x-> System.out.print( x + " ") );

        /*Stream of odd numbers */
        System.out.println();

        Stream.iterate(0,i->i+1).filter(x->x%2!=0)// odd
               .limit(10).forEach(x-> System.out.print( x + " "));

        /*Fibonacci example */
        System.out.println();

        Stream.iterate(new int[]{0,1}, i->new int[]{i[1],i[0]+i[1]})
                .limit(20)
                .map(i->i[0])
                .forEach(x-> System.out.print(x+" "));

    }
}
