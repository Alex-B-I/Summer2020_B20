package day61_Maps;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
1. write a program that can remove the palindrome string from a list of String
			DO NOT use Lambda expressions
 */
public class RemovePalindrome {
    public static void main(String[] args) {

        String[]words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch20"};
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String each = it.next();
            //String reverse = Util.revers(each);
            String reverse = "";
            for (int i =each.length()-1;i>=0;i--){
                reverse+=each.charAt(i);
            }
            //System.out.println(each+" : "+reverse);
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }

        }
        System.out.println(list);

    }


}
