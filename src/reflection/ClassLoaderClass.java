package reflection;


/**
 * ������Ҫʹ��ĳ����ʱ��������໹δ�����ص��ڴ��У���ϵͳ��ͨ����ļ��ء�������ӡ���ĳ�ʼ��
 * ������������������г�ʼ����������������������JVM��������������������裬������ʱҲ������
 * ������ͳ��Ϊ����ػ������ʼ��
 */
public class ClassLoaderClass {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c); // AppClassLoader
        ClassLoader c2 = c.getParent();
        System.out.println(c2); // PlatformClassLoader
        ClassLoader c3 = c2.getParent();
        System.out.println(c3); // null
    }
}
