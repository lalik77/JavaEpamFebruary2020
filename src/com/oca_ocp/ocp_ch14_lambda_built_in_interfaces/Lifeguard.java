package com.oca_ocp.ocp_ch14_lambda_built_in_interfaces;

import java.util.function.Predicate;

class Tourist {

    public Tourist(double distance) {

        this.distance = distance;

    }

    public double distance;
}

public class Lifeguard {

    private void saveLife(Predicate<Tourist> canSave , Tourist tourist) {

        System.out.println(canSave.test(tourist) ? "Saved" : "Too Far"); // y1
    }

    public static void main(String... sand) {
        new Lifeguard().saveLife( s -> s.distance < 4 , new Tourist(2));

    }
}
