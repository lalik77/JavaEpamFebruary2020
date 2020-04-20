package com.oca_ocp.ocp_ch14_lambda_built_in_interfaces;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//Q10
public class Market {

    private static void checkPrices (List<Double> prices , Consumer<Double> scanner) {

        prices.forEach(scanner);
    }

    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(1.2,6.5,3.0);

        checkPrices(prices,

                p ->{
            String result = p < 5 ? "Correct" : "Too high";
                    System.out.println(result);
                }

                );
    }
}
