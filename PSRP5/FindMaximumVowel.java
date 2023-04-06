package Task;

import java.util.ArrayList;
import java.util.List;

//Given a string, find the words with the maximum number of vowels.
public class FindMaximumVowel {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps right over the little lazy dog.";
        //int count =0;
        List<String > list =new ArrayList<>();
        String[] strArray = str.split(" ");
        for(String s: strArray){
            int count =0;
            for(int i=0;i<s.length();i++){
                if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    count=count+1;
                }
            }
            if(count == 2){
                list.add(s);
            }
        }

        System.out.println(list);
    }
}
