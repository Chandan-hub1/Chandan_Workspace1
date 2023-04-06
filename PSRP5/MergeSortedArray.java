package Task;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int  arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int arr3[] = new int[len1+len2];
        int i=0,j=0,k=0;

        while (i<len1){
            arr3[k++] = arr1[i++];
        }

        while (j<len2){
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);

        for (int x=0;x<arr3.length;x++){
            System.out.println(arr3[x]);
        }


    }
}
