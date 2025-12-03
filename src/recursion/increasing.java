package recursion;

public class increasing {
    public static void incre(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        incre(n-1);
        System.out.println(n+ "");
    }
    public static void main(String[] args) {
        int n= 10;
        incre(10);
    }
}
