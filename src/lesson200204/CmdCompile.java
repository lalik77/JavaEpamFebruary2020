package lesson200204;


/**
 * Урок 04 февраля 2020
 * **/

/**
 * Создаем папку classes Test>mkdir classes
 *
 * компилируем с помощью находясь над кооневой папкой src
 *
 * ...\JavaEpamFebruary2020>javac -d classes src/lesson200204/CmdCompile.java
 *
 * Получаем два файла CmdCompile.class и Box.class в папке classes
 *
 * или для компиляции всех файлов
 * ...\JavaEpamFebruary2020>javac -d classes src/lesson200204/*
 *





 *
 * **/

public class CmdCompile {



        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.println(new Box(Math.random() * 10));
            }

        }

}

class Box {

    private double size;

    public Box(double size) {
        this.size = size;
    }

    public String toString() {
        return "Box have size " + size;
    }
}