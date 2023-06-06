package file;
import java.beans.Transient;
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 5923003911550370832L;
    private String name;
    private Integer age;

    public Student() {
        super();
    }

    public Student(String name, Integer age) {
        super();
        System.out.println("Init Person...");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class MyObjectOutputStream {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));


        Student s = new Student("曹晨磊", 30);
        System.out.println("序列化前"+s.toString());
        oos.writeObject(s);
        Student o = (Student)ois.readObject();
        System.out.println("反序列化后"+o.toString());

        oos.close();
    }
}
