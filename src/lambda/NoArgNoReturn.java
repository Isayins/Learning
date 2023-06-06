package lambda;


public class NoArgNoReturn {
    public static void main(String[] args) {
        myInterShow(()->System.out.println("Hello,World"));
    }
    public static void myInterShow(MyInter mi){
        mi.show();
    }
}
