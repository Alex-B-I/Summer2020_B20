package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;
/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> map = new HashMap<>();

        for (String letter: strings){

            if (!map.containsKey(letter)){
                map.put(letter,0);
            }
             map.put(letter, map.get(letter)+1);
           // map.get("a", map.get("a")+1);
        }
        return map;
    }

}
