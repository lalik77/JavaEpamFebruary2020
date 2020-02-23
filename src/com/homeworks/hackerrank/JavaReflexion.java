package com.homeworks.hackerrank;


import java.lang.reflect.Method;

class StudentReflexion {

    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }


}



public class JavaReflexion {

    public static void main(String[] args) {

        Class student = StudentReflexion.class;
        StudentReflexion reflexion = new StudentReflexion();
        //Class student2 = Class.forName("com.homeworks.hackerrank.StudentReflexion"); // error надо выбросить исключение
        Class student3 = reflexion.getClass(); // вернет объект класса класс через экземпляр класса

        //System.out.println(student); // -> class com.homeworks.hackerrank.StudentReflexion
        //System.out.println(student3); // -> class com.homeworks.hackerrank.StudentReflexion

        /*Создаем массив типа Method куда засунем декларированные методы в нашем классе*/
        Method[] methods = student.getDeclaredMethods();

        for ( Method m: methods) {
            System.out.println(m.getName());

         }
        System.out.println("***********************************************");

        Class refl_class = Student.class;
        methods = refl_class.getDeclaredMethods();
        for (Method m: methods   ) {
            System.out.println( m.getName() );
        }

    }


}
