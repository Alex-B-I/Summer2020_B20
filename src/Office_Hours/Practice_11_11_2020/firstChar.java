package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;
/*

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
/*
a->aa
b->bb
c->cc
 */
        Map<String,String> map = new HashMap<>();
        for (String word: strings){

            String key = word.substring(0,1);
            if (!map.containsKey(key)){
              map.put(key,word); // initial value
            }else {
                map.put(key,map.get(key)+word); //updating the value
            }
        }
        return map;
    }

}
