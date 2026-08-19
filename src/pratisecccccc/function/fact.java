package pratisecccccc.function;

public class fact {

    public static int f(int n){
        int m=1;
        for (int i =1; i <=n ; i++) {
            m=m*i;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
