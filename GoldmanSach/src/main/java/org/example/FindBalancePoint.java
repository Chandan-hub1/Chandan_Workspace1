package org.example;

/**Write a function that return findBalancePoint from an array
[1,2,3,1,2] => balancing points is 3 here because
leftSideSum = (1 + 2) = (1+2) rightSideSum
balancing point is 3 so return 2 index of 3, if we didn’t find balancing point return -1
**/
public class FindBalancePoint {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2};
        int balPoint = findBalancePoint(arr);
    }

    public static int  findBalancePoint(int[] arr){


        return -1;
    }
}
