package com.homeworks.hackerrank;


import java.util.Calendar;


/**

  Solution's   @author  Mami Alex

 the class Result has to be written in the Hackerrank

   Complete the 'findDay' function below.
  *
  * The function is expected to return a STRING.
  * The function accepts following parameters:
  *  1. INTEGER month
  *  2. INTEGER day
  *  3. INTEGER year

 **/



class Result {

    public static String findDay(int month,int day,int year) {



        Calendar cal = Calendar.getInstance() ;
        cal.set(year,month-1,day);


        //Date date = cal.getTime();
        //System.out.println(cal.getTime().toString()); // ->  Wed Aug 05 12:00:08 MSK 2015





         // System.out.println(cal.getCalendarType()); // -> gregory
         // System.out.println(cal.get(Calendar.YEAR));
         // System.out.println(cal.get(Calendar.MONTH));
         // System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        //LocalDate localDate= new LocalDate();

        // DateFormatSymbols ;
        // getWeekdays();



        String[] strDays = new String[] {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int idx = cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println(idx);

        String s = strDays[idx-1];

        return s;
    }
}



public class JavaDateAndTime {

    public static void main(String[] args) {

    System.out.println(Result.findDay(2,11,2020));

    }




    }



