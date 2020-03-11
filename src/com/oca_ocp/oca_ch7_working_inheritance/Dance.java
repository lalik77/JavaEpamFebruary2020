package com.oca_ocp.oca_ch7_working_inheritance;

import java.io.FileNotFoundException;

/*Q41 */

class SuperDance {

    protected void dance() throws FileNotFoundException {}
}

public class Dance extends SuperDance{

     // public void dance() throws IOException {};// error

    // void dance() /* throws IOException */ {}; //error
   //   private void dance() throws FileNotFoundException {}; // error

    // public void dance() throws FileNotFoundException {}; //error

    public void dance() {};


}
