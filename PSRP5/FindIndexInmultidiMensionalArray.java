package Task;

public class FindIndexInmultidiMensionalArray {
    public static void main(String[] args) {
        int mat[][] = { {10, 20, 30, 40}, {15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        int key = 29;
        int[] result = {-1,-1};
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == key){
                    System.out.println("Found at "+ i+" "+j);
                }
            }
        }
    }
}
