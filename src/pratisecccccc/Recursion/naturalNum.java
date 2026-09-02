package pratisecccccc.Recursion;

public class naturalNum {

    public static int Naturalno(int n){
        if(n==0)
            return 0;
        return n+Naturalno(n-1);
    }



    public static void main(String[] args) {
        System.out.println(Naturalno(4));
    }
}
