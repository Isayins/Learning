package file;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student1 implements Serializable {
    private static final long serialVersionUID = 5923003911550370832L;
    private String name;
    private Integer age;

    public Student1() {
        super();
    }

    public Student1(String name, Integer age) {
        super();
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

public class MyObjectOutputStreamReverse {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

        Object obj = ois.readObject();
        Student1 s = (Student1) obj;
        System.out.println(s);

        ois.close();
    }
}

