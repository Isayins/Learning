package reflection;

public class Employee {
    public String name;
    Integer age;
    private String address;

    public Employee(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee(String address) {
        this.address = address;
    }
    public Employee(String address,Integer age) {
        this.age = age;
        this.address = address;
    }
    public Employee() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     Integer getAge() {
        return age;
    }

     void setAge(Integer age) {
        this.age = age;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
