package collection;

import java.util.Properties;
import java.util.Set;

public class MyProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // �洢Ԫ��
        prop.put("student1", "����ϼ");
        prop.put("student2", "������");

        // ��ͨ����
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

        // ���з���
        prop.setProperty("student3", "����");
        prop.setProperty("student4", "�ŷ�");

        // ���б���
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }
    }
}
