package lesson200206;

// TODO спросить про примитивы что декларируются при создании объекта , где хранятся . Вроде нашел ответ - в Heap

public class TransferByValue {

    public static void main(String []  args) {

        Storage storage = new Storage(10);

        System.out.println(storage.i);

        changeStorage(storage);

        System.out.println("После вызова метода chnageStorage() , переменная i в объекте storage = " + storage.i);

        System.out.println("После вызова сэттера в обэекте storage");
        storage.setI(50);
        System.out.println("storage.i = " + storage.i);




    }


    public static void changeStorage (Storage x){

        x = new Storage(20);
        x.i=20; //
        System.out.println("Внутри метода changeStоrage() x.i = " + x.i);
    }

}

class Storage {

     int i;


    public Storage(int i) {
        this.i = i;


    }

    public void setI(int i) {
        this.i = i;
    }
}