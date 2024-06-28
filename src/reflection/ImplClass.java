package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("��ӹ���");
    }

    @Override
    public void delete() {
        System.out.println("ɾ������");
    }

    @Override
    public void update() {
        System.out.println("�޸Ĺ���");
    }

    @Override
    public void find() {
        System.out.println("���ҹ���");
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Ȩ��У��");
        Object result = method.invoke(target, args);
        System.out.println("��־��¼");
        System.out.println();
        return result;
    }
}

public class ImplClass {


    public static void main(String[] args) throws Exception {
        UserDao ud1 = new UserDaoImpl();
        ud1.add();
        ud1.delete();
        ud1.update();
        ud1.find();
        System.out.println("----------");

        UserDao ud2 = new UserDaoImpl();
        MyInvocationHandler handler = new MyInvocationHandler(ud2);
        UserDao ud2Proxy = (UserDao) Proxy.newProxyInstance(ud2.getClass().getClassLoader(), ud2.getClass().getInterfaces(), handler);
        ud2Proxy.add();
        ud2Proxy.delete();
        ud2Proxy.update();
        ud2Proxy.find();
    }
}
