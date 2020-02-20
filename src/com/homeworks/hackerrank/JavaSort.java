package com.homeworks.hackerrank;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
/*create class StudentComparator */

class  StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {


         if(o1.getCgpa()!=o2.getCgpa()) {

             return (int) (o2.getCgpa() * 1000 - o1.getCgpa() * 1000);
         }
         else
             if (!o1.getFname().equals(o2.getFname()))
             {

             return o1.getFname().compareTo(o2.getFname());
         }
         else return o1.getId()-o2.getId();

    }
}

// ----------------End of class StudentComparator -------------------------------------

public class JavaSort {

    public static void main(String[] args) {

        // ---------- Test CASE 0 ------------------------------
        List<Student> studentList = new ArrayList<>();
        Student student1=new Student(33, "Rumpa",3.68);
        Student student2=new Student(85, "Ashis",3.85);
        Student student3=new Student(56, "Samiha",3.75);
        Student student4=new Student(19, "Samara",3.75);
        Student student5=new Student(22, "Fahim",3.76);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        // ------------------ **** ------------------------------------------------------

        /* This is the code to  complete in the main methode */
        StudentComparator comparator=new StudentComparator();
        Collections.sort(studentList,comparator);
       // *********************************************************************************
        for(Student st: studentList){
            System.out.println(st.getFname());
        }

    }

}
