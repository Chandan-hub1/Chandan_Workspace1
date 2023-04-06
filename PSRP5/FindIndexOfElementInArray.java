package Task;


//Given a sorted array of n elements, write a function to find the index of a given element.
//if not found return -1.
public class FindIndexOfElementInArray {
    public static void main(String[] args) {
        int arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};
        int num=111;
        boolean flag=false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                flag=true;
                index=i;
            }
        }
        if(flag){
            System.out.println(index);
        }else
            System.out.println(index);
    }
}
