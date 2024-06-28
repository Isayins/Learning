package enumeration;

public class DirectionDemo {
    public static void main(String[] args) {
        Direction1 d1 = Direction1.FRONT;
        System.out.println(d1);
        System.out.println("----------");

        Direction2 d2 = Direction2.FRONT;
        System.out.println(d2);
        System.out.println(d2.getName());
        System.out.println("----------");

        Direction3 d3 = Direction3.FRONT;
        System.out.println(d3);
        System.out.println(d3.getName());
        d3.show();
    }
}