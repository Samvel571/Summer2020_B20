package mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySet {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Test Student 11", 11);
        map.put("Test Student 12", 12);
        map.put("Test Student 13", 13);
        map.put("Test Student 14", 14);
        map.put("Test Student 15", 15);

        System.out.println(map);

        Set<Map.Entry<String, Integer>> allEntries = map.entrySet();
        System.out.println("allEntries = " + allEntries);

        for (Map.Entry<String, Integer> eachEntry : allEntries ){
            //System.out.println(eachEntry.getKey());
            //System.out.println(eachEntry.getValue());
             if (eachEntry.getValue() == 11){
                 eachEntry.setValue(100);
             }
            System.out.println(eachEntry.getValue());
        }
        System.out.println(map);

    }
}