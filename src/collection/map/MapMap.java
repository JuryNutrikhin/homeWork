package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();


        testMap(hashMap);
        System.out.println();
      testTest(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(1, "Bob");
        map.put(3, "Jhon");
        map.put(2, "Tom");
        map.put(5, "Tim");
        map.put(4, "Mike");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void testTest(Map<Integer, String> map1) {
        map1.put(11, "Bob");
        map1.put(12, "Bob2");
        map1.put(11, "Dog");
        map1.put(10, "Tor");
        map1.put(10, "Bob3");

        for(Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }

}
