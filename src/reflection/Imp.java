package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ������ָ������ʱȥ��ȡһ����ı����ͷ�����Ϣ��Ȼ��ͨ����ȡ������Ϣ����������
 * ���÷�����һ�ֻ��ơ� �������ֶ�̬�ԣ����Լ������ǿ���������ԣ�
 * �������ڱ����ھ����ȷ��������������Ȼ������չ
 */
public class Imp {
    public static void main(String[] args)  throws Exception {

        /**
         * ��ȡClass�����
         */

//        // ����1��ʹ�����class��������ȡ�����Ӧ��Class����
//        Class<Employee> c1 = Employee.class;
//        System.out.println(c1);
//        // ����2�����ö����getClass()���������ظö����������Ӧ��Class����
//        Class<? extends Employee> c2 = new Employee().getClass();
//        System.out.println(c2);
//        // ����3��ʹ��Class���еľ�̬����forName(String className)
//        Class<?> c3 = Class.forName("Employee");
//        System.out.println(c3);


        /**
         * �����ȡ���췽��
         * ����������
         * | ����                                                        | ����                                                |
         * | ----------------------------------------------------------- | ------------------------------------------------- |
         * | public Constructor<?>[] getConstructors()                   | ����һ������Constructor��������飬������˽�й���        |
         * | public Constructor getConstructor(Class<?>�� parameterTypes) | ����һ��ָ����Constructor���󣬲�����˽�й���           |
         * | public Constructor<?>[] getDeclaredConstructors()           | ����һ������Constructor��������飬����˽�й���         |
         * | public Constructor getConstructor(Class<?>�� parameterTypes) |                                                  |
         */

//        Class<Employee> c = Employee.class;
//        // ��ȡ���й����Ĺ��췽��
//        Constructor<?>[] constructors = c.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }
//        System.out.println("--------------------");
//
//        // ��ȡָ�������ҹ����Ĺ��췽��
//        Constructor<Employee> constructor = c.getConstructor(String.class, int.class, String.class);
//        System.out.println(constructor);
//        System.out.println("--------------------");
//
//        // ��ȡ����Ȩ�޵Ĺ��췽��
//        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
//        for (Constructor<?> declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }
//        System.out.println("--------------------");
//
//        // ��ȡָ�������Ҳ��޵Ĺ��췽��
//        Constructor<Employee> declaredConstructor = c.getDeclaredConstructor(String.class);
//        System.out.println(declaredConstructor);


        /**
         * �����ȡ��Ա����
         * ��������:
         * | ����                                       | ����                                        |
         * | ------------------------------------------ | ------------------------------------------|
         * | public Field[] getFields()                 | ����һ������Field��������飬������˽�б���      |
         * | public Field getField(String name)         | ����һ��ָ����Field���󣬲�����˽�б���         |
         * | public Field[] getDeclaredFields()         | ����һ������Field��������飬����˽�б���       |
         * | public Field getDeclaredField(String name) | ����һ��ָ����Field���󣬰���˽�б���          |
         */

//        Class<Employee> c = Employee.class;
//        // ��ȡ���й����ĳ�Ա����
//        Field[] fields = c.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//        System.out.println("--------------------");
//
//        // ��ȡָ�������ҹ����ĳ�Ա����
//        Field field = c.getField("name");
//        System.out.println(field);
//        System.out.println("--------------------");
//
//        // ��ȡ����Ȩ�޵ĳ�Ա����
//        Field[] declaredFields = c.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
//        System.out.println("--------------------");
//
//        // ��ȡָ�������Ҳ��޵ĳ�Ա����
//        Field declaredField = c.getDeclaredField("name");
//        System.out.println(declaredField);


        /**
         * �����ȡ��Ա����
         * ����������
         * | ����                                                                     | ����                                              |
         * | ----------------------------------------------------------------------- | ------------------------------------------------ |
         * | public Method[] getMethods()                                            | ����һ������Method��������飬������˽�г�Ա����        |
         * | public Method getMethod(String name, Class<?>�� parameterTypes)          | ����һ��ָ����Method���󣬲�����˽�г�Ա����           |
         * | public Method[] getDeclaredMethods()                                    | ����һ������Method��������飬����˽�г�Ա����         |
         * | public Method getDeclaredMethod(String name, Class<?>�� parameterTypes)  | ����һ��ָ����Method���󣬰���˽�г�Ա����            |
         */

        Class<Employee> c = Employee.class;
        // ��ȡ���й����ĳ�Ա����������ӳ�����ӿڻ�ӳ���ͳ����ӿڼ̳е������������
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("--------------------");

        // ��ȡָ�������ҹ����ĳ�Ա����������ӳ�����ӿڻ�ӳ���ͳ����ӿڼ̳е������������
        Method method = c.getMethod("setName", String.class);
        System.out.println(method);
        System.out.println("--------------------");

        // ��ȡ����Ȩ�޵ĳ�Ա����������ӳ�����ӿڵ���������
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("--------------------");

        // ��ȡָ�������Ҳ��޵ĳ�Ա����������ӳ�����ӿڵ���������
        Method declaredMethod = c.getDeclaredMethod("setAddress", String.class);
        System.out.println(declaredMethod);
    }
}
