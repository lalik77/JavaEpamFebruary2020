package lesson200211.Button;

public class ButtonPresser extends Button {

    public static void main(String[] args) {

        useButton( new NuclearButton() );
        useButton (new RedButton());
    }

    @Override
    public void press() {

    }

    public static void check() {}
}
