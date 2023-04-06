package Task;

import java.sql.SQLOutput;

//Find the next greatest element for each element in the Array
public class NextGreatestElementInArray {
    public static void main(String[] args) {
        int[] arr = {15, 10, 16, 20, 8, 9, 7, 50};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j+1] ){
                    System.out.println(arr[i] +"-"+ arr[j+1]);
                    break;
                }

            }
            if (arr.length-2 == i){
                System.out.println(arr[i+1] +"-"+ "1");
            }
        }

    }
}
