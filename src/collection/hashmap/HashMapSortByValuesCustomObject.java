package collection.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.*;

public class HashMapSortByValuesCustomObject {

    private static HashMap<String, Student> sort(Map<String, Student> map){
        LinkedHashMap linkedHashMap = new LinkedHashMap<String, Student>();

        List<Map.Entry<String, Student>> list = new LinkedList(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));

        for(Map.Entry<String, Student> entry : list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();

        map.put("sr-10",new Student(1, "Parwinder"));
        map.put("sr-12",new Student(2, "Amandeep"));
        map.put("sr-11",new Student(3, "Navjot"));
        map.put("sr-09",new Student(4, "Davinder"));

        System.out.println("Before Mapping");
        System.out.println(map);

        System.out.println("\n\nAfter Mapping");
        map = sort(map);
        System.out.println(map);

    }
}
