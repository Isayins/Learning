package enumeration;

public class Direction2 {
    // 创建几个实例
    public static final Direction2 FRONT = new Direction2("前");
    public static final Direction2 BEHIND = new Direction2("后");
    public static final Direction2 LEFT = new Direction2("左");
    public static final Direction2 RIGHT = new Direction2("右");

    // 私有构造方法
    private Direction2(String name) {
        this.name = name;
    }

    // 加入成员变量
    private String name;

    public String getName() {
        return name;
    }
}