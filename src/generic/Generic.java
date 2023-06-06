package generic;

public class Generic<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T> void show(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Generic<String> g1 = new Generic<>();
        g1.setT("String");
        System.out.println("g1.getT() = " + g1.getT());
        Generic<Integer> g2 = new Generic<>();
        g2.setT(200);
        System.out.println("g2.getT() = " + g2.getT());
        Generic<Boolean> g3 = new Generic<>();
        g3.setT(true);
        System.out.println("g3.getT() = " + g3.getT());

        Generic generic = new Generic();
        generic.show("String");
        generic.show(100);
        generic.show(true);
    }
}
