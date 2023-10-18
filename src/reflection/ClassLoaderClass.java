package reflection;


/**
 * 当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过类的加载、类的连接、类的初始化
 * 这三个步骤来对类进行初始化。如果不出现意外情况，JVM将会连续完成这三个步骤，所以有时也把这三
 * 个步骤统称为类加载或者类初始化
 */
public class ClassLoaderClass {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c); // AppClassLoader
        ClassLoader c2 = c.getParent();
        System.out.println(c2); // PlatformClassLoader
        ClassLoader c3 = c2.getParent();
        System.out.println(c3); // null
    }
}
