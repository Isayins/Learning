package lambda;

public class ArgReturn {
    public static void main(String[] args) {
        myInterShow((x,y)->x*y);

    }

    public static void myInterShow(MyInter2 mi) {
        int show = mi.show(10, 20);
        System.out.println(show);
    }

}
