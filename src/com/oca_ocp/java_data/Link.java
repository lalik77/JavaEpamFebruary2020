package com.oca_ocp.java_data;

public class Link {

    private String name;
    private Link next;
    public Link( String name, Link next) {

        this.name=name;
        this.next=next;
    }

    public void setNext(Link next) {

        this.next=next;
    }
    public Link getNext() {

        return next;
    }

    @Override
    public String toString() {
        return  " name " + name ;
    }

    public static void main(String[] args) {
        Link link1=new Link("x",null);
        Link link2=new Link("y",link1);
        Link link3=new Link("z",link2);
        Link link4=new Link("last",null);

        link2.setNext(link3);
        link3.setNext(link2);
        link1=null;
        link3=null;

       // System.out.println("link1" + link1.toString()); //Exception in thread "main" java.lang.NullPointerException

        System.out.println("link2" + link2.toString() );

    }
}
