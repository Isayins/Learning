package collection;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("吕布", "貂蝉");
        map.put("项羽", "虞姬");
        map.put("郭靖", "黄蓉");
        map.put("后裔", "嫦娥");
        System.out.println(map.toString());

        // 删除元素
        map.remove("郭靖");
        System.out.println(map.toString());

        // 判断集合是否包含指定键
        boolean containsKey = map.containsKey("吕布");
        System.out.println(containsKey);

        // 判断集合是否包含指定值
        boolean containsValue = map.containsValue("貂蝉");
        System.out.println(containsValue);

        // 判断集合是否为空
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        // 获取集合元素个数
        int size = map.size();
        System.out.println(size);

        // 清空集合所有元素
        map.clear();
        System.out.println(map.toString());

        // 添加另外集合元素
        Map<String, String> m = new HashMap<String, String>();
        m.put("张三", "李四");
        m.put("王五", "小六");
        map.putAll(m);
        System.out.println(map.toString());

        // 根据键获取值
        System.out.println(map.get("张三"));

        Set<String> keySet = map.keySet();

        Iterator<String> keysIterator = keySet.iterator();
        while (keysIterator.hasNext()) {
            System.out.println(keysIterator.next());
        }

        for (String key : keySet) {
            System.out.println(key);
        }

        Collection<String> values = map.values();
        Iterator<String> valuesIterator = values.iterator();
        while (valuesIterator.hasNext()) {
            System.out.println(valuesIterator.next());
        }

        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key +" "+"value = " + value);
        }
    }
}
