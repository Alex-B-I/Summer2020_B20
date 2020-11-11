package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;
/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
 */
public class wordAppend {
    /*
    a->1
    b->1

    result = a
     */
    public String wordAppend(String[] strings) {
        String result = "";
        Map<String,Integer>map = new HashMap<>();
        for (String each: strings){
            if (!map.containsKey(each)){
                map.put(each,1);
            }else {
                result +=each;
                map.remove(each);
            }
        }
        return result;
    }
}
