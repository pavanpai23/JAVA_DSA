package pratisecccccc.BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int MaskBit=1<<pos;

        int result=MaskBit | n;
        System.out.println(result   );
    }
}
