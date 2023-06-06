package file;

import java.io.*;

class Teacher implements Serializable{
    private static final long serialVersionUID = 5923003911550370832L;
    private String name;
    private Integer age;
    transient String username;

    public Teacher(){
        super();
    }
    public Teacher(String name, Integer age, String username) {
        super();
        this.name = name;
        this.age = age;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}

public class MyTransient {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));


        Teacher s = new Teacher("曹晨磊", 30,"123");
        System.out.println("序列化前"+s.toString());
        oos.writeObject(s);
        Teacher o = (Teacher)ois.readObject();
        System.out.println("反序列化后"+o.toString());
    }
}
