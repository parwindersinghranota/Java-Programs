/*
HashMap - Sorting By Values
I have used Comparator as Lambda here in Collections.sort method.
After Sorting use LinkedHashMap because it preserves insertion order
 */
import java.util.*;

public class HashMapSortByValuesByUsingLamda {
    private static HashMap<String, Integer> sort(HashMap<String, Integer> map){
        HashMap<String, Integer> temp = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        //Lambda Expression
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        //Method Reference
        //Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        for(Map.Entry<String, Integer> entry : list){
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
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
