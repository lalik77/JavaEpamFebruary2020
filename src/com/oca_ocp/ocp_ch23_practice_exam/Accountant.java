package com.oca_ocp.ocp_ch23_practice_exam;

//Q6
public class Accountant {

    class AddingException extends Exception{}
    class DividingException extends Exception{}

    class UnexpectedException extends RuntimeException{}


    public void doTaxes() throws Throwable {
        try {
            //throw new IllegalStateException();
            throw new  Exception();
        }catch (AddingException | DividingException e) {
            System.out.println("Math problem");
        }
        catch ( /*UnexpectedException |*/   Exception f) {
            System.out.println("Uknown error");
            throw f;


        }


    }

    public static void main(String[] numbers) throws Throwable{
        try {
            new Accountant().doTaxes();

        }finally {
            System.out.println("All done");
        }

    }
}
