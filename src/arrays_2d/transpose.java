package arrays_2d;

public class transpose {
    public static void transpose(int mat[][]){
        int row=2;
        int col=3;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        int[][] transpose=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]=mat[i][j];
            }
        }
    }
    public static void main(String[] args) {

      int mat[][]={{2,3,7},{5,6,7}};

      transpose(mat);
    }
}
