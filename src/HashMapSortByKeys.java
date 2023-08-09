/*
HashMap - Sorting By Keys
Simple solution is store Map into TreeMap
 */
import java.util.*;

public class HashMapSortByKeys {
    private static Map<String, Integer> sort(Map<String, Integer> map){

        Map<String, Integer> temp = new TreeMap<>(map);

        return temp;
    }

    public static void main(String args[]){

        Map<String, Integer> map = new HashMap<>();
        map.put("Parwinder",54);
        map.put("Sandeep",34);
        map.put("Navjot",65);
        map.put("Harniwaz",23);
        map.put("Baldev",66);
        map.put("Kuldeep",12);
        System.out.println("Before Sorting");
        System.out.println(map);

        System.out.println("\nAfter Sorting");
        map = sort(map);
        System.out.println(map);
    }
}
