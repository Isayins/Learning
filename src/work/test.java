package work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Object hkyt = null;
        Map map = new HashMap<String,Object>();
        map.put("vdef102",2);
        map.put("Vdef102",1);
        System.out.println(map.get("VDEf102"));
//        List list = new ArrayList<Map<String, Object>>(){["vdef102",null]};
//        String a="";
//        list.add(map);
//        if (list.get(0).!= null )
//            a = list.get(0).toString();
    }
}
