package lesson200213;
/**
 * TODO gc() and fonalize() -> check
 *
 * **/
public class Info {

    private  int i;

    public Info(int i){

        this.i=i;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("die");;
    }

    public static void main(String[] args) {
        Info info=new Info(10);
        System.gc();
        info =new Info(15);

    }
}
