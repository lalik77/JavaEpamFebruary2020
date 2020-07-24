package com.oca_ocp.ocp_ch16_exceptions_and_assertions;

//Q14
class MissingMoneyException extends Exception {}
class MissingFoodExceptions extends Exception{}
public class Problems {
    public void doIHaveAProblem() throws MissingFoodExceptions,MissingMoneyException {
        System.out.println("No problems");
    }

    public static void main(String[] args) throws MissingFoodExceptions, MissingMoneyException {

        try {
            final Problems p = new Problems();
            p.doIHaveAProblem();
        } catch (Exception e) {
            throw e;
        }
    }
}
