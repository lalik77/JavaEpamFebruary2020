package com.homeworks.hackerrank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        //Write code here

        /* NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale INDIAN = new Locale("en","IN");
        NumberFormat indianCurrency = NumberFormat.getCurrencyInstance(INDIAN);

        String india=indianCurrency.format(payment);
        String us=usCurrency.format(payment);
        String china=chinaCurrency.format(payment);
        String france=franceCurrency.format(payment); */

        NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(Locale.CHINESE);
        System.out.println(chinaCurrency.format(payment));

        /*Setting a Indian Locale*/
        Locale INDIAN=new Locale("en","IN");
        NumberFormat indianCurrency = NumberFormat.getCurrencyInstance(INDIAN);
        System.out.println(indianCurrency.format(payment));

       // Locale indianLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
       // System.out.println(indianLocale);
        //System.out.println(Currency.getInstance(indianLocale).getSymbol());

         // System.out.println( NumberFormat.getCurrencyInstance(Locale.CHINESE) ) ; //

        System.out.println( NumberFormat.getCurrencyInstance(Locale.US).format(payment) );


        String us;
        //System.out.println("US : " + us);
        //System.out.println("US : " + india);
        //System.out.println("US : " + china);
        // System.out.println("US : " + france);
    }
}
