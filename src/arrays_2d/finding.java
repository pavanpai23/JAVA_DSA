package arrays_2d;

import java.util.Scanner;

public class finding {
    public static boolean search(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("element found at cell( "+ i  +" , "+ j + ")");
                    return true;
            }
            System.out.println();
        }
    }
        System.out.println("element not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3, m=3;
//        int n=matrix.length ,,, n=matrix[0].length;

        Scanner in=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}
