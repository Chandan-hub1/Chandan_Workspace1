package Task;

import java.util.*;

public class SmallestPairOfValueOfTwoArray {
    public static void main(String[] args) {
        int A[] = {1, 3, 15, 11, 2};
        int B[] = {23, 127, 235, 19, 8};

        int m = A.length;
        int n = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        Map<Integer,List<Integer>> smallest = findSmallestDifference(A, B, m, n);
        smallest.entrySet().stream().limit(1).forEach(s-> System.out.println(s.getKey()+" Pair of "+s.getValue()));
    }

    private static Map<Integer,List<Integer>> findSmallestDifference(int[] a, int[] b, int m, int n) {

        int x=0,y=0;
        int result = Integer.MAX_VALUE;
        int p1=0,p2=0;
        Map<Integer,List<Integer>> map = new TreeMap<>();
        while(x<m && y< n){
            if(Math.abs(a[x]-b[y]) < result){
                List<Integer> list = new ArrayList<>();
                list.add(a[x]);
                list.add(b[y]);
                map.put(Math.abs(a[x]-b[y]),list);
            }
            if(a[x]<b[y]){
                x++;
            }else {
                y++;
            }
        }
        return map;
    }

}
