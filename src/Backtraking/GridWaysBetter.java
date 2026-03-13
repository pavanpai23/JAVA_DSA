package Backtraking;

public class GridWaysBetter {
    public static long fact(int x){
        long f=1;
        for (int i = 0; i < x; i++) {
            f=f*i;
        }
        return f;
    }

    public  static int uniquePaths(int m, int n) {

        long total = fact(m + n - 2);
        long down = fact(m - 1);
        long right = fact(n - 1);

        return (int)(total / (down * right));
        }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
}
