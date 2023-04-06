package Task;
//Reversal program with special characters.
//Input: Swa$pn&il
//Output : lin$pa&wS
public class ReversalProgramWithSpecialCharacters {
    public static void main(String[] args) {
        String str= "Swa$pn&il";
        char[] charArray = str.toCharArray();
        reverse(charArray);
        System.out.println(charArray);
    }
    public static void reverse(char[] arr){
        int r=arr.length-1; int l=0;
        while (l<r){
            if(!Character.isAlphabetic(arr[l])){
                l++;
            }else if(!Character.isAlphabetic(arr[r])){
                r--;
            }else {
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
                l++;
            }
        }
    }
}
