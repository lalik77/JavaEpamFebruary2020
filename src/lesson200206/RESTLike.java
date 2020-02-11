package lesson200206;

public class RESTLike {


    static void accept(Request request) {

        System.out.println(request.count);
        System.out.println(request.match);


    }

    public static void main(String []  args) {

        Request request=new Request();
        accept(request); //



    }


}

class  Request {

    /* В классе Request при испльзвании оболочный тип данных
    *  переменные  count и mach инициализируются как null

    * */
//    Integer count;
//    Boolean match;
      // TODO помотреть разницу между примитивным и оболочным типом данных
    /* В классе Request при испльзвании примитивного  типа данных
     *  переменные  count и mach инициализируются как 0 для int и false для mach

     * */
    int count;
    boolean match;

}
