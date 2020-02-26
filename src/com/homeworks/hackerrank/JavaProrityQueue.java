package com.homeworks.hackerrank;

import java.util.*;


class Student3 implements Comparable<Student3> {

    private int id;
    private String name;
    private double cgpa;

    public Student3(int id, String name, double cgpa) {

        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA () {

        return cgpa;
    }

    @Override
    public int compareTo(Student3 o) {
        if( this.cgpa<o.cgpa ) return 1;
        if( this.cgpa>o.cgpa ) return -1;
        if( this.cgpa==o.cgpa ) {
            if ( this.name.compareTo(o.name )  < 0 ) {return -1 ;}
            if ( this.name.compareTo(o.name) > 0 )   { return 1 ;}
            if ( this.name.compareTo(o.name ) == 0 ) {

                if ( this.id < o.id) { return -1; }
                if ( this.id > o.id ) { return 1 ;}
            }

        }
        return 0;
    }


}

class Priorities {

    public List<Student3> getStudents(List<String> events) {

         Queue<Student3> queue = new PriorityQueue<>();

         for (int i= 0 ; i < events.size() ; i ++ ) {

             if ( events.get(i).contains("SERVED") ) {

                 if (queue.size() > 0 ) { queue.poll();}
             }else {

                 String[] data = events.get(i).split(" ");
                 queue.add( new Student3( Integer.parseInt( data[3]) , data[1] , Double.valueOf(data[2]) ) ) ;
             }
         }

         List<Student3> result = new ArrayList<>();
         while(queue.size() > 0 ) {

             result.add(queue.poll());
         }

        return result;
    }
}
/***  for first test entry on std in
 *
 ENTER John 3.75 50
 ENTER Mark 3.8 24
 ENTER Shafaet 3.7 35
 SERVED
 SERVED
 ENTER Samiha 3.85 36
 SERVED
 ENTER Ashley 3.9 42
 ENTER Maria 3.6 46
 ENTER Anik 3.95 49
 ENTER Dan 3.95 50
 SERVED

 * */

public class JavaProrityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student3> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student3 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
