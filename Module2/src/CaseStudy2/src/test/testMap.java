package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("A", "A");
        map.put("B", "B");
        map.put(23, "C");
        Set set=map.keySet();
        for (Object key:set) {
            System.out.println(key +" "+map.get(key));
        }
    }
}
