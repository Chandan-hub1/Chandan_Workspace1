package Task;

public class Permutations {

    public static void main(String[] args) {
        String input = "ABC";
        permute(input);
    }

    private static void permute(String input) {
        permuteHelper("", input);
    }

    private static void permuteHelper(String prefix, String suffix) {
        int n = suffix.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permuteHelper(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1));
            }
        }
    }
}

