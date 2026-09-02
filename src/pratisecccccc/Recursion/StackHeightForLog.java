package pratisecccccc.Recursion;

public class StackHeightForLog {

    public static double xPowerN(double x,int n){
        if(n==0)
            return 1;
        //check for even
        if(n%2==0){
            return xPowerN(x,n/2)*xPowerN(x,n/2);
        }
        else{
            /// for odd
        return xPowerN(x,n/2)*xPowerN(x,n/2)*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(xPowerN(2,5));
    }
}
