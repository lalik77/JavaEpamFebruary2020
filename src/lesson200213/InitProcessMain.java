package lesson200213;

/**
 * TODO с инициализаторами повторить
 * **/

public class InitProcessMain {
    public static void main(String[] args) {



    }
}

class InitA {

    static {
        System.out.println("static init A id -1" + InitA.ui);
    }

    {
        System.out.println("init A id-2");

    }



    static int ui=10; // так не надо делать объявлять раньше блока инициализатора
}

class initB extends  InitA {

    public initB() {

        System.out.println("Constructor B");
    }
}


