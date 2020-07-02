package com.oca_ocp.ocp_ch13_generics_and_collections;

interface Comic <C> {
    void draw(C c);
}

class ComicClass <C> implements Comic<C> {

    public void draw(C c) {
        System.out.println(c);
    }
}

class SnoopyClass implements Comic<Snoopy> {
    public void draw(Snoopy c) {
        System.out.println(c);
    }
}

class SnoopyComic implements Comic<Snoopy> {

   public  void draw(Snoopy c) {
        System.out.println(c);
    }
}

public class Snoopy {

    Comic<Snoopy> c4 = new SnoopyComic();
}
