package enumeration;

public abstract class Direction3 {
    // 创建几个实例
    public static final Direction3 FRONT = new Direction3("前") {
        @Override
        public void show() {
            System.out.println("前");
        }

    };
    public static final Direction3 BEHIND = new Direction3("后") {
        @Override
        public void show() {
            System.out.println("后");
        }

    };
    public static final Direction3 LEFT = new Direction3("左") {
        @Override
        public void show() {
            System.out.println("左");
        }

    };
    public static final Direction3 RIGHT = new Direction3("右") {
        @Override
        public void show() {
            System.out.println("右");
        }

    };

    // 加入成员变量
    private String name;

    // 私有构造方法
    private Direction3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 加入抽象方法
    public abstract void show();
}
