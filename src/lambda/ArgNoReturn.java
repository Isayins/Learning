package lambda;

public class ArgNoReturn {
    public static void main(String[] args) {
        myInterShow((s) -> System.out.println(s));
    }

    public static void myInterShow(MyInter1 mi) {
        mi.show("hello,world1");
    }

}
