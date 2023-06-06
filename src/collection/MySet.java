package collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

class Student{
        private String name;
        private Integer age;

	public Student() {
            super();
        }

	public Student(String name, Integer age) {
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

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((age == null) ? 0 : age.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Student other = (Student) obj;
            if (age == null) {
                if (other.age != null)
                    return false;
            } else if (!age.equals(other.age))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
}
public class MySet {
    public static void main(String[] args) {
        // 创建集合
        Collection<Student> collection = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 主要条件
                int sort1 = s1.getAge() - s2.getAge();
                // 次要条件
                int sort2 = sort1 == 0 ? s1.getName().compareTo(s2.getName()) : sort1;
                return sort2;
            }
        });

        // 添加元素
        collection.add(new Student("王五", 22));
        collection.add(new Student("王五", 22));
        collection.add(new Student("张三1", 20));
        collection.add(new Student("张三0", 20));
        collection.add(new Student("李四0", 18));
        collection.add(new Student("李四1", 18));
        System.out.println(collection.toString());
    }

}
