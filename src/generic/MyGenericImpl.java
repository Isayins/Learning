package generic;

public class MyGenericImpl<T> implements MyGeneric<T>{
    @Override
    public void show(T t) {
        System.out.println("t = " + t);
    }


    public static void main(String[] args) {
        MyGenericImpl<String> g1 = new MyGenericImpl<>();
        g1.show("String");
        MyGenericImpl<Integer> g2 = new MyGenericImpl<>();
        g2.show(30);
        MyGenericImpl<Boolean> g3 = new MyGenericImpl<>();
        g3.show(true);
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
    }

    // 格式：修饰符 返回值类型 方法名(数据类型… 变量名) { }
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
