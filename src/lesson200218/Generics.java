package lesson200218;

import java.util.ArrayList;
import java.util.List;

class MedicalStaff { }

class Doctor extends MedicalStaff { }

class HeadDoctor extends  Doctor {}


public class Generics {

    public static void main(String[] args) {

        // По иерархии
        // 1 MedicalStaff
        // 2 Doctor
        // 3 HeadDoctor

        /* Рассмотрим такую запись < ? extends T > */

         //   List<? extends Doctor > list1 = new ArrayList<MedicalStaff>();  // error по иерархии можно только вниз

         List< ? extends Doctor > list2 = new ArrayList<>(); // new ArrayList<Doctor>
         List< ? extends Doctor > list3 = new ArrayList<HeadDoctor>();


         /* Рассмотрим такую запись   <? super T > */

         List<? super Doctor> list4= new ArrayList<Object>();
         List<? super HeadDoctor> list5=new ArrayList<MedicalStaff>();
         List<? super HeadDoctor> list6=new ArrayList<Doctor>();
        //  List<? super Doctor> list7 = new ArrayList<HeadDoctor>();  // error по иерархии можно только вверх



    }
}
