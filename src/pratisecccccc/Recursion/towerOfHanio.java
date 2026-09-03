package pratisecccccc.Recursion;

public class towerOfHanio {
    public static void hanio(int n,String src,String hel,String des){
        if(n==1) {
            System.out.println();
            return;
        }
        hanio(n-1,src,des,hel);
        System.out.println("transfer disk " + n + " from " +src+" to " +des  );
        hanio(n-1,hel,src,des);

    }

    public static void main(String[] args) {
        int n=2;
        hanio(n,"S","H","D");
    }
}
