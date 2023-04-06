package Task;

import java.util.*;

// Find the longest word in a sentence?.
public class LongestWordInString {
    public static void main(String[] args) {
        String str = "I am interested to grow in my organization";
        String[] strArray = str.split(" ");
        Map<Integer,String> map=new HashMap<>();

        for(String s:strArray) {
            map.put(s.length(),s);
        }
        Integer num = map.entrySet().stream().map(Map.Entry::getKey).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(map.get(num));



    }
}
