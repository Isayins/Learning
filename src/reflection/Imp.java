package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射是指在运行时去获取一个类的变量和方法信息，然后通过获取到的信息来创建对象，
 * 调用方法的一种机制。 由于这种动态性，可以极大的增强程序的灵活性，
 * 程序不用在编译期就完成确定，在运行期仍然可以扩展
 */
public class Imp {
    public static void main(String[] args)  throws Exception {

        /**
         * 获取Class类对象
         */

//        // 方法1：使用类的class属性来获取该类对应的Class对象
//        Class<Employee> c1 = Employee.class;
//        System.out.println(c1);
//        // 方法2：调用对象的getClass()方法，返回该对象所属类对应的Class对象
//        Class<? extends Employee> c2 = new Employee().getClass();
//        System.out.println(c2);
//        // 方法3：使用Class类中的静态方法forName(String className)
//        Class<?> c3 = Class.forName("Employee");
//        System.out.println(c3);


        /**
         * 反射获取构造方法
         * 方法描述：
         * | 方法                                                        | 描述                                                |
         * | ----------------------------------------------------------- | ------------------------------------------------- |
         * | public Constructor<?>[] getConstructors()                   | 返回一个包含Constructor对象的数组，不包含私有构造        |
         * | public Constructor getConstructor(Class<?>… parameterTypes) | 返回一个指定的Constructor对象，不包含私有构造           |
         * | public Constructor<?>[] getDeclaredConstructors()           | 返回一个包含Constructor对象的数组，包含私有构造         |
         * | public Constructor getConstructor(Class<?>… parameterTypes) |                                                  |
         */

//        Class<Employee> c = Employee.class;
//        // 获取所有公开的构造方法
//        Constructor<?>[] constructors = c.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }
//        System.out.println("--------------------");
//
//        // 获取指定参数且公开的构造方法
//        Constructor<Employee> constructor = c.getConstructor(String.class, int.class, String.class);
//        System.out.println(constructor);
//        System.out.println("--------------------");
//
//        // 获取所有权限的构造方法
//        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
//        for (Constructor<?> declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }
//        System.out.println("--------------------");
//
//        // 获取指定参数且不限的构造方法
//        Constructor<Employee> declaredConstructor = c.getDeclaredConstructor(String.class);
//        System.out.println(declaredConstructor);


        /**
         * 反射获取成员变量
         * 方法描述:
         * | 方法                                       | 描述                                        |
         * | ------------------------------------------ | ------------------------------------------|
         * | public Field[] getFields()                 | 返回一个包含Field对象的数组，不包含私有变量      |
         * | public Field getField(String name)         | 返回一个指定的Field对象，不包含私有变量         |
         * | public Field[] getDeclaredFields()         | 返回一个包含Field对象的数组，包含私有变量       |
         * | public Field getDeclaredField(String name) | 返回一个指定的Field对象，包含私有变量          |
         */

//        Class<Employee> c = Employee.class;
//        // 获取所有公开的成员变量
//        Field[] fields = c.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//        System.out.println("--------------------");
//
//        // 获取指定名称且公开的成员变量
//        Field field = c.getField("name");
//        System.out.println(field);
//        System.out.println("--------------------");
//
//        // 获取所有权限的成员变量
//        Field[] declaredFields = c.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
//        System.out.println("--------------------");
//
//        // 获取指定名称且不限的成员变量
//        Field declaredField = c.getDeclaredField("name");
//        System.out.println(declaredField);


        /**
         * 反射获取成员方法
         * 方法概述：
         * | 方法                                                                     | 描述                                              |
         * | ----------------------------------------------------------------------- | ------------------------------------------------ |
         * | public Method[] getMethods()                                            | 返回一个包含Method对象的数组，不包含私有成员方法        |
         * | public Method getMethod(String name, Class<?>… parameterTypes)          | 返回一个指定的Method对象，不包含私有成员方法           |
         * | public Method[] getDeclaredMethods()                                    | 返回一个包含Method对象的数组，包含私有成员方法         |
         * | public Method getDeclaredMethod(String name, Class<?>… parameterTypes)  | 返回一个指定的Method对象，包含私有成员方法            |
         */

        Class<Employee> c = Employee.class;
        // 获取所有公开的成员方法，它反映此类或接口或从超类和超级接口继承的类的声明方法
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("--------------------");

        // 获取指定参数且公开的成员方法，它反映此类或接口或从超类和超级接口继承的类的声明方法
        Method method = c.getMethod("setName", String.class);
        System.out.println(method);
        System.out.println("--------------------");

        // 获取所有权限的成员方法，它反映此类或接口的声明方法
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("--------------------");

        // 获取指定参数且不限的成员方法，它反映此类或接口的声明方法
        Method declaredMethod = c.getDeclaredMethod("setAddress", String.class);
        System.out.println(declaredMethod);
    }
}
