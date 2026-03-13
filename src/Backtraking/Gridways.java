package Backtraking;

public class Gridways {
    public static int grid(int i,int j,int n,int m){
        //base case
        if(i==n-1  && j==m-1){//condition fro last cell
            return 1;
        }else if(i==n || j==m){//boundary cross conditon
            return 0;

        }
        int w1=grid(i+1,j,n,m);
        int w2=grid(i,j+1,n,m);
        return w1;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(grid(0,0,n,m));
    }
}
