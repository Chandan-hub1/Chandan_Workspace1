package Task;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfCharacterInWord {
    public static void main(String[] args) {
        String str="organization";
        char[] charArray=str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int count=0;
        for(Character c: charArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,count+1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
