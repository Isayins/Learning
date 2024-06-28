package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    // ��Ա������һ��˽�У�һ��Ĭ�ϣ�һ������
    private String name;
    int age;
    public String address;

    // ���췽����һ��˽�У�һ��Ĭ�ϣ���������
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

    // ��Ա����������˽�У�����Ĭ�ϣ���������
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
        // ��ȡѧ���������
        Class<Student> c = Student.class;
        // ͨ���޲ι��촴��
        Constructor<Student> constructor = c.getConstructor();
        Student newStudent = constructor.newInstance();
        System.out.println(newStudent);
        System.out.println("--------------------");

        // �������ó�Ա����
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(newStudent, "������");
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(newStudent, 55);
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        address.set(newStudent, "�䵱ɽ");
        System.out.println(newStudent);
        System.out.println("--------------------");

        // ����ִ�г�Ա����
        Method getName = c.getDeclaredMethod("getName");
        getName.setAccessible(true);
        getName.invoke(newStudent);
        Method setAge = c.getDeclaredMethod("setAge", int.class);
        setAge.setAccessible(true);
        setAge.invoke(newStudent, 60);
        System.out.println(newStudent);
    }
}