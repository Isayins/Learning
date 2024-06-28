package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    // 成员变量：一个私有，一个默认，一个公共
    private String name;
    int age;
    public String address;

    // 构造方法：一个私有，一个默认，两个公共
    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 成员方法：两个私有，两个默认，两个公共
    private String getName() {
        System.out.println("getName");
        return name;
    }

    private void setName(String name) {
        System.out.println("setName:" + name);
        this.name = name;
    }

    int getAge() {
        System.out.println("getAge");
        return age;
    }

    void setAge(int age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }

    public String getAddress() {
        System.out.println("getAddress");
        return address;
    }

    public void setAddress(String address) {
        System.out.println("setAddress:" + address);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // 获取学生类类对象
        Class<Student> c = Student.class;
        // 通过无参构造创建
        Constructor<Student> constructor = c.getConstructor();
        Student newStudent = constructor.newInstance();
        System.out.println(newStudent);
        System.out.println("--------------------");

        // 反射设置成员变量
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(newStudent, "张三丰");
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(newStudent, 55);
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        address.set(newStudent, "武当山");
        System.out.println(newStudent);
        System.out.println("--------------------");

        // 反射执行成员方法
        Method getName = c.getDeclaredMethod("getName");
        getName.setAccessible(true);
        getName.invoke(newStudent);
        Method setAge = c.getDeclaredMethod("setAge", int.class);
        setAge.setAccessible(true);
        setAge.invoke(newStudent, 60);
        System.out.println(newStudent);
    }
}