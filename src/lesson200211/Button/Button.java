package lesson200211.Button;

public abstract class Button {

    public abstract void press();

    public static void check() {


    }

    public static void useButton (Button buton) {

        buton.press();
        buton.check();
    }
}
