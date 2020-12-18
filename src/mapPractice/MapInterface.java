package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class MapInterface {

    public static void main(String[] args) {


        Map<String, Integer> scoreMap = new HashMap<>();

        System.out.println("scoreMap.size() = " + scoreMap.size());

        scoreMap.put("Adam", 90);
        scoreMap.put("Jessica", 85);
        scoreMap.put("Nara", 95);
        System.out.println("scoreMap = " + scoreMap);
        System.out.println("scoreMap.size() = " + scoreMap.size());

        System.out.println("scoreMap.get(\"Nara\") = " + scoreMap.get("Nara"));
        System.out.println("scoreMap.values() = " + scoreMap.values());

        System.out.println("scoreMap.isEmpty() = " + scoreMap.isEmpty());
        System.out.println("scoreMap.keySet() = " + scoreMap.keySet());

        System.out.println("scoreMap.containsKey(\"Jessica\") = " + scoreMap.containsKey("Jessica"));

        scoreMap.put("Nara", 97);// will not add key but will update the value
        System.out.println(scoreMap);

        System.out.println("scoreMap.containsValue(95) = " + scoreMap.containsValue(95));
        System.out.println("scoreMap.containsValue(95) = " + scoreMap.containsValue(97));

        System.out.println("scoreMap.remove(\"Jessica\") = " + scoreMap.remove("Jessica"));
        System.out.println(scoreMap);

        System.out.println("scoreMap.values() = " + scoreMap.values());

        System.out.println("==============================");

        Map<String, Integer> scoreMap2 = new HashMap<>();
        scoreMap2.put("Diana", 80);
        scoreMap2.put("Alex", 92);
        scoreMap2.put("Beian", 70);

        System.out.println(scoreMap2);


      scoreMap.putAll(scoreMap2);
        System.out.println(scoreMap);

       // scoreMap2.clear();
     scoreMap.putIfAbsent("Nara", 100);
        System.out.println("scoreMap = " + scoreMap);

        System.out.println(scoreMap.get("Sam"));
        System.out.println("scoreMap.getOrDefault(\"Sam\", 60) = " + scoreMap.getOrDefault("Sam", 60));

        System.out.println("scoreMap = " + scoreMap);

        System.out.println("scoreMap.remove(\"Adam\",90) = " + scoreMap.remove("Adam", 90));
        System.out.println("scoreMap = " + scoreMap);
        System.out.println("=========================================");

        System.out.println("scoreMap = " + scoreMap);
        Set<String> keys = scoreMap.keySet();
        System.out.println("set = " + keys);

        keys.remove("Diana");
        System.out.println(scoreMap);

        Collection<Integer> allScores = scoreMap.values();
        System.out.println("allScores = " + allScores);

        allScores.remove(92);
        System.out.println("scoreMap = " + scoreMap);

        for (String eachKey : keys){
            System.out.println("key is: "+ eachKey + ",  value is : "+scoreMap.get(eachKey));
        }

        System.out.println("=========================================");

        Set<Entry<String, Integer>> entries = scoreMap.entrySet();
        System.out.println("entries = " + entries);

        for (Entry<String,Integer> eachEntry : entries){
            System.out.println(eachEntry);
            System.out.println("eachEntry.getKey() = " + eachEntry.getKey());
            System.out.println("eachEntry.getValue() = " + eachEntry.getValue());


        }


    }

}
