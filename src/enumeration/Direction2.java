package enumeration;

public class Direction2 {
    // ��������ʵ��
    public static final Direction2 FRONT = new Direction2("ǰ");
    public static final Direction2 BEHIND = new Direction2("��");
    public static final Direction2 LEFT = new Direction2("��");
    public static final Direction2 RIGHT = new Direction2("��");

    // ˽�й��췽��
    private Direction2(String name) {
        this.name = name;
    }

    // �����Ա����
    private String name;

    public String getName() {
        return name;
    }
}