package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("添加功能");
    }

    @Override
    public void delete() {
        System.out.println("删除功能");
    }

    @Override
    public void update() {
        System.out.println("修改功能");
    }

    @Override
    public void find() {
        System.out.println("查找功能");
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object result = method.invoke(target, args);
        System.out.println("日志记录");
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
