package recursion;

public class optimizedPower {
    public static int optimized(int x,int n){
        if(n==0){
            return -1;
        }
        int halfpow=optimized(x,n/2)*optimized(x,n/2);

        //for odd
        if(n%2!=0){
            halfpow=x*halfpow;
        }
        return halfpow;
    }
    public static void main(String[] args) {
int x=2;
int n=10;
        System.out.println(optimized(x,n));
    }
}
