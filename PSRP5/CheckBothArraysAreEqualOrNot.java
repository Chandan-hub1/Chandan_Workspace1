package Task;

import java.util.Arrays;

public class CheckBothArraysAreEqualOrNot {
    public static void main(String[] args) {
        int arr1[] = {21,6,8,9,10,5};
        int arr2[] = {10,21,5,8,6,9};

       if(checkArrayAreEquals(arr1,arr2))
           System.out.println("Equal");
       else
           System.out.println("Not Equal");
    }

    private static boolean checkArrayAreEquals(int[] arr1, int[] arr2) {
        boolean flag = true;
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 != len2)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<len1;i++){
            if(arr1[i] != arr2[i]){
                flag = false;
                break;
            }
        }

        return flag;
    }
}
