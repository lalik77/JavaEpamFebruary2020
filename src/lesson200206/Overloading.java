package lesson200206;

public class Overloading {

    public static void main(String[] args){

        int i =Integer.MAX_VALUE;

        System.out.println("Integer.MAX_VALUE = " + i);

        i++;
        System.out.println(i); // 2147483648
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}
