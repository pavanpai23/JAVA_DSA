package Bitmanupulation;

public class update_ithbit {
        public static int clear_ith(int n,int i){
            int bitmask=~(1<<i);
            return n&bitmask;
        }
        public static int update(int n,int i,int newbit){
            n=clear_ith(n,i);
            int bitmask=newbit<<i;
            return n|bitmask;
        }

    public static void main(String[] args) {
        System.out.println(update(10,2,1));
    }
}
