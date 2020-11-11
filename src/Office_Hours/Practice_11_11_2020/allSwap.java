package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

 */

public class allSwap {
    public static void main(String[] args) {
        String [] arr = {"juice","car","apple", "cat", "jump","class", "airport","carpet"};
        System.out.println(Arrays.toString(allSwap(arr)));
    }


    public static String[] allSwap(String[] strings) {
        Map<Character,Integer> map =new HashMap<>(); //helps us keep track of each element

        for (int i =0; i <strings.length; i++){
            char key= strings[i].charAt(0);
            if (!map.containsKey(key)){
                map.put(key,i);
            }else {
             String temp = strings[i];
             strings[i]=strings[map.get(key)]; //strings[3]=strings[2]
             strings[map.get(key)] =temp;
             map.remove(key);
            }
        }
        return strings;
    }

}
