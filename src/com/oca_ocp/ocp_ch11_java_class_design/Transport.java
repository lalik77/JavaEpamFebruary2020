package com.oca_ocp.ocp_ch11_java_class_design;


import java.util.Collection;
import java.util.Iterator;

//q26
public class Transport {
    static interface Vehicle {}
    static  class Bus implements Vehicle,Collection {
        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean addAll(Collection c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }


    }
    static  class Van extends Bus{}

    public static void main(String[] args) {
        Bus bus = new Van();
        Van van = new Van();
        Van[] vans = new Van[0];

        boolean b = bus instanceof Vehicle;
        boolean v = van instanceof Vehicle;
        boolean a = vans instanceof Vehicle[];

        System.out.println(b + " " + v  + " " +a);

        boolean c = vans instanceof Collection[];
        System.out.println(c);

        boolean n =  null instanceof Vehicle;
        System.out.println(n);

        String s=null;
        System.out.println(s);

        boolean str = s instanceof String;
        System.out.println(str);
    }


}
