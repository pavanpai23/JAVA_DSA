package arrays_2d;

public class staircase {
    public static boolean staircase(int mat[][],int key){
        int row=0;
        int col=mat[0].length-1;

        while(row<mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("(" +row +","+ col+")");
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else{
                row++;

            }

        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int key=10;
        staircase(mat,key);
    }
}
