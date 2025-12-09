package recursion;

public class friendParing {
    public static int pair(int n){
     if(n==1||n==2){
         return n;
     }

        //single
        int fnm1=pair(n-1);

        //pair
        int fnm2=pair(n-2);
        int pairways=(n-1)*fnm2;

        int total=fnm1+pairways;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
