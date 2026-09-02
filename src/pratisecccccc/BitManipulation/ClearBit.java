package pratisecccccc.BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
//        int n=5;
//        int pos=2;
//        int BitMask=1<<pos;
//        int ans=~BitMask;
//        int result=ans&n;
//        System.out.println(result);
    int x=1;
    int y=4;
    int n=x^y;
    int cn=0;
        for (int i = 0; i<=n; i++) {
            cn++;
        }
        System.out.println(cn);


    }
}
