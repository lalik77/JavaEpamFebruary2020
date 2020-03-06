package com.oca_ocp.oca_ch6_working_methods_encapsulation;

public class Games {

    public final static int finish (/*final*/ int score ){
      final int win=3;
      /*final*/  int result = score++ < 5 ? 2: win;
      return result +=win;

    }
}
