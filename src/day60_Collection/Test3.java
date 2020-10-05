package day60_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
       // System.out.println("methodAnagram(\"David\",\"Lucy\") = " + methodAnagram("David", "Lucy"));
        System.out.println(methodAnagram("aaaabbbb","abababab"));
    }

    public static boolean methodAnagram(String str1,String str2){
        String[] str1Arr = str1.toLowerCase().split("");
        String[] str2Arr = str2.toLowerCase().split("");

        Set <String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(str1Arr));

        Set <String> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(str2Arr));


        return set1.equals(set2);
    }
}
