package Task;

public class FindFirstRepeatingElementInArray {
    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int N = arr.length;
        firstRepeating(arr, N);
    }

    static void firstRepeating(int[] arr, int n) {
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] hash = new int[max + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int repeating = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] > 1) {
                repeating = arr[i];
                break;
            }
        }

        if (repeating == Integer.MIN_VALUE) {
            System.out.println("There are no repeating elements");
        } else {
            System.out.println("The first repeating element is : " + repeating);
        }
    }
}
