package com.oca_ocp.oca_ch10_practice_exam;


//E:\Dropbox\Уроки\Java\JavaEpamFebruary2020>  javac -d out src/com/oca_ocp/oca_ch10_practice_exam/Indexing.java


//E:\Dropbox\Уроки\Java\JavaEpamFebruary2020> java -classpath ./out/ com.oca_ocp.oca_ch10_practice_exam.Indexing cars carts

public class Indexing {

    public static void main(String... books) {

        //System.out.println("Hello world");
        //System.out.println(books.toString());

       StringBuilder sb = new StringBuilder();

        for(String book : books)
            sb.insert(sb.indexOf("c"),book);
        System.out.println(sb);

    }
}
