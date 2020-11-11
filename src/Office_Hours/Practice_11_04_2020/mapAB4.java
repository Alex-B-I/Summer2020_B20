package Office_Hours.Practice_11_04_2020;

import java.util.Map;
/*

Modify and return the given map as follows: if the keys "a" and "b" have values that have
different lengths, then set "c" to have the longer value. If the values exist and have the
same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a")&& map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");
            if (aVal.length()==bVal.length()){
                map.put("a","");
                map.put("b","");
            }else {
                String cVal = aVal.length()>bVal.length()?aVal:bVal;
                map.put("c",cVal);
            }
        }


        return map;
    }
}
