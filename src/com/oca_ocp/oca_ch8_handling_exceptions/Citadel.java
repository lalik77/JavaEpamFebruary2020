package com.oca_ocp.oca_ch8_handling_exceptions;


class CastleUnderSiegeException extends Exception{}

class KnightAttackingException extends CastleUnderSiegeException {}


public class Citadel {

    public void openDrawbridge() throws RuntimeException { // q1

        try{
            throw new KnightAttackingException();

        }catch (Exception e){
            throw new ClassCastException();

        }finally{

            // Its a checked exception , need to be handled , or declared in method instead of RuntimException

           //  throw new CastleUnderSiegeException();

           /*  try{throw new CastleUnderSiegeException();
            }catch(CastleUnderSiegeException e){ e.printStackTrace();}  */


        }
    }

    public static void main(String[] args) {
        new Citadel().openDrawbridge();
    }



}
